(function($) {

    var editingUser = false;

    this.startSharingBag = function(id) {
      if (editingUser) {
        stopSharingBag();
      }
      editingUser = id;
      hideEl('addLink-' + id);
      showEl('shareEdit-' + id);
    };

    this.stopSharingBag = function() {
      if (editingUser) {
        hideEl('shareEdit-' + editingUser);
        showEl('addLink-' + editingUser);
      }
      editingUser = false;
    };

    this.addUser = function(id, bagName) {
/*      if (failureNotification != null) {
        //failureNotification.$el.hide('slow', function() {failureNotification.remove()});
        failureNotification.$el.html('');
      }*/
      var user = jQuery('#userValue-' + id).val();
      var callBack = function(returnStr) {
        var sendInvite, notification, failureMessage = returnStr;
        if (returnStr == 'ok') {
          refreshSharingUsers(bagName, id);
          jQuery('#userValue-' + id).val('');
        } else {
            if (returnStr.match(/not found/)) {
                failureMessage = jQuery("<span>");
                failureMessage.append(returnStr);
                failureMessage.append(" Would you like to send an invitation to " + user + "? ");
                jQuery("<button>OK</button>").appendTo(failureMessage).click(function(evt) {
                    notification.close();
                    if (window.$SERVICE) {
                      var errHandler = function(err) {new FailureNotification({message: err}).render()};
                      $SERVICE.fetchList(bagName, function(l) {
                          l.inviteUserToShare(user).fail(errHandler);
                      }).fail(errHandler);
                    } else {
                        new FailureNotification({message: "You are not logged in"}).render();
                    }
                });
            }
            notification = new FailureNotification({message: failureMessage});
            notification.render();
        }
      };
      if (user != '') {
        AjaxServices.addUserToShareBag(user, bagName, callBack);
      }
    };

    this.refreshSharingUsers = function(bagName, id) {
      var callBack = function(users) {
        displayUsers(id, users, bagName);
      };
      AjaxServices.getUsersSharingBag(bagName, callBack);
    };

    this.deleteUser = function(user, bagName, id) {
      var callBack = function(returnStr) {
        if (returnStr == 'ok') {
          refreshSharingUsers(bagName, id);
        } else {
          new FailureNotification({message: returnStr}).render();
        }
      };

      AjaxServices.deleteUserToShareBag(user, bagName, callBack);
    };

    this.displayUsers = function(id, users, bagName) {
      var usersl = users.length,
      parent = $('#sharingUsers-' + id).empty();
      for (i = 0; i < usersl; i++) {
        user = users[i];
        addUserSpan(id, user, bagName);
      }
    };

    this.addUserSpan = function(id, user, bagName) {
      var parent = $('#sharingUsers-' + id);
      var span = $('<span class="tag">');
      var a = $('<a class="deleteTagLink">[x]</a>');
      a.click(function() {
          deleteUser(user, bagName, id);
      });
      span.append(user).append(a);
      parent.append(span);
    };

}).call(window, jQuery);
