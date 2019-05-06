<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="im" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- spellDisplayer.jsp 
<div>
<h3>SPELL DataSets Expression</h3>
<div id="spell-viz"></div>
</div>

<script type="text/javascript">
google.load("visualization", "1", {packages: ["corechart"]});
google.setOnLoadCallback(drawSPellChart);

function drawSPellChart() {
	
		console.log(arguments);	
		
		 // Create and populate the data table.			
        var table = new google.visualization.DataTable(); 
        var data = <c:out value="${expressionScoreCounts}"/>;       
        var columns = ["20-", "-18 to -20", "-16 to -18", "-14 to -16", "-12 to -14", "-10 to -12", "-8 to -10", "-6 to -8", "-6 to -4", "-2 to -4", "-2 to 0", 
                        "0 to 2", "2 to 4", "4 to 6", "6 to 8", "8 to 10", "10 to 12", "12 to 14", "14 to 16", "16 to 18", "18 to 20", "20+"];
             
        //var columns = ["20-", "", "-16 to -18", "", "-12 to -14", "", "-8 to -10", "", "-6 to -4", "", "-2 to 0", 
       // "0", "0 to 2", "", "4 to 6", "", "8 to 10", "", "12 to 14", "", "16 to 18", "", "20+"];


        table.addColumn('string', 'Log2 Ratios');
        table.addColumn('number', 'Number of Experiments');
          
        table.addRows(22);

        for(var i=0; i< columns.length; ++i){
        	table.setValue(i, 0, columns[i].toString());
        	table.setValue(i,1, data[i]);
        }
          
        // Create and draw the visualization.
        new google.visualization.ColumnChart(document.getElementById('spell-viz')).
            draw(table, {title: "SPELL Expression Summary", width:600, height:400, vAxis: {title: "Number of Experiments"}, hAxis: {title: "Log2 Ratios"}}
        );
};

</script>

 /spellDisplayer.jsp -->


<!-- spellDisplayer.jsp -->
<div>
<h3>SPELL DataSets Expression</h3>
<div id="spell-viz"></div>
</div>

<script type="text/javascript">

function drawSPellChart() {
	
		console.log(arguments);	
		
		 // Create and populate the data table.			
        var table = new google.visualization.DataTable(); 
        var data = <c:out value="${expressionScoreCounts}"/>;       
        var columns = ["20-", "-18 to -20", "-16 to -18", "-14 to -16", "-12 to -14", "-10 to -12", "-8 to -10", "-6 to -8", "-6 to -4", "-2 to -4", "-2 to 0", 
                        "0 to 2", "2 to 4", "4 to 6", "6 to 8", "8 to 10", "10 to 12", "12 to 14", "14 to 16", "16 to 18", "18 to 20", "20+"];
             
        table.addColumn('string', 'Log2 Ratios');
        table.addColumn('number', 'Number of Experiments');
          
        table.addRows(22);

        for(var i=0; i< columns.length; ++i){
        	table.setValue(i, 0, columns[i].toString());
        	table.setValue(i,1, data[i]);
        }
          
        // Create and draw the visualization.
        new google.visualization.ColumnChart(document.getElementById('spell-viz')).
            draw(table, {title: "SPELL Expression Summary", width:600, height:400, vAxis: {title: "Number of Experiments"}, hAxis: {title: "Log2 Ratios"}}
        );
};

google.load("visualization", "1", {packages: ["corechart"], "callback": drawSPellChart});


</script>

<!-- /spellDisplayer.jsp -->