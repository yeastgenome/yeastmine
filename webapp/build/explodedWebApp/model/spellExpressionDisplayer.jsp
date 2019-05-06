<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!-- spellExpressionDisplayer.jsp -->

<c:if test="${signals != '[]'}">
<div>

<h3>SPELL expression</h3>
<div id="flyatlas-viz"></div>

<div id="flyatlas-viz2"></div>

<div class="table">
<form id="fly-atlas-options">
	<table border="0" cellspacing="0" class="refSummary">
		<tbody>
		<tr>
			<td><input type="radio" name="scale" value="log" checked="checked"/></td><td>Logarithmic Scale</td>
			<td class="border-left"><input type="radio" name="orderExpr" value="tissue.name" checked="checked"/></td><td>Order by Name</td>
			<td class="border-left"><input type="radio" name="dataPoint" value="enrichment" checked="checked" /></td><td>Show enrichment</td>
		</tr>
		<tr class="even">
			<td class="theme-3-border theme-6-background"><input type="radio" name="scale" value="linear"/></td>
			<td class="theme-3-border theme-6-background">Linear Scale</td>
			<td class="theme-3-border theme-6-background border-left"><input type="radio" name="orderExpr" value="signal"/></td>
			<td class="theme-3-border theme-6-background">Order by Signal</td>
			<td class="theme-3-border theme-6-background border-left"><input type="radio" name="dataPoint" value="signal" /></td>
			<td class="theme-3-border theme-6-background">Show signal strength</td>
		</tr>
		</tbody>
	</table>
</form>
</div>
</div>

<script type="text/javascript">
google.load("visualization", "1", {packages: ["corechart"]});
google.setOnLoadCallback(drawFlyAtlasChart);
function drawFlyAtlasChart(event, sortBySignal, useLinearScale, showSignal) {
	var sortByName = !sortBySignal;
	//var showEnrichment = !showSignal;
	var showEnrichment = true;
	useLinearScale = true;
	var useLog = !useLinearScale;
	console.log(arguments);
	var signal_data = new google.visualization.DataTable();
	var scores = <c:out value="${scores}"/>;
	var conditions = <% out = pageContext.getOut();
	out.write(request.getAttribute("conditions").toString());
	%>;
	
    signal_data.addColumn('string', 'Condition');
    signal_data.addColumn('number', 'Score');
	var countArray = new Array(100);

    var baseUrl = "/${WEB_PROPERTIES['webapp.path']}/objectDetails.do?id=";

	for (var i = 0; i < 5; i++) {
	//for (var i = 0; i < scores.length; i++) {
	 	var score = Math.log(scores[i])/Math.log(2);

		// 1. round - 6.33333 ==> 6 (maybe not?)
		var roundedScore = Math.round(score);
		// 2. put in count array - increment the array entry for this score
		// countArray[score]++
	
		if (countArray[roundedScore]) {
			countArray[roundedScore]++;
	    } else {
	    	countArray[roundedScore] = 0;	    
	    }
		// 3. flip array around so that google can draw it
		// finalArray = [count, score]
		// [23, 6.0]

	
	}
	for (var i = 0; i < countArray.length; i++) {
		if (countArray[i]) {
			var signal_row = [i, countArray[i]];
  			signal_data.addRow(signal_row);
  		}
  	}


var data = signal_data;

	if (sortByName) {
		data.sort([{column: 0}]);
	}

	var useLogScaleOption = (useLog && !showEnrichment) ? true : false;

	var haxis = (showEnrichment) ? "Enrichment" : "Signal Intensity";
	if (useLog && showEnrichment) {
		haxis += " (log²)";
	}

	var maxH = (showEnrichment) ? null : 10000;
	var baseLine = (showEnrichment && useLinearScale) ? 1 : null;

	var height = 80 + (18 * scores.length);
	var viz = new google.visualization.BarChart(document.getElementById('flyatlas-viz'));
	viz.draw(
		    data,
			{isStacked: true,
			 colors: ['#314bbc','#8931bc','#bc3162'],
			 title: "SPELL Expression",
			 width: 920, height: height,
			 legendTextStyle: {fontSize: 10},
			 vAxis: {title: "Condition count", textStyle: {fontSize: 11}},
			 hAxis: {title: haxis, logScale: useLogScaleOption, maxValue: maxH, baseline: baseLine, baselineColor: '#8931bc'},
			}
		);

};

jQuery("input[name='scale']").change(function() {
	var useLinearScale = ('linear' == jQuery(this).val());
	var orderBySignal = ('signal' == jQuery("input[name='orderExpr']:checked").val());
	var showSignal = ('signal' == jQuery("input[name='dataPoint']:checked").val());
	drawFlyAtlasChart(null, orderBySignal, useLinearScale, showSignal);
});n   bn 

jQuery("input[name='orderExpr']").change(function() {
	var orderBySignal = ('signal' == jQuery(this).val());
	var useLinearScale = ('linear' == jQuery("input[name='scale']:checked").val());
	var showSignal = ('signal' == jQuery("input[name='dataPoint']:checked").val());
	drawFlyAtlasChart(null, orderBySignal, useLinearScale, showSignal);
});

jQuery("input[name='dataPoint']").change(function() {
	var showSignal = ('signal' == jQuery(this).val());
	var useLinearScale = ('linear' == jQuery("input[name='scale']:checked").val());
	var orderBySignal = ('signal' == jQuery("input[name='orderExpr']:checked").val());
	drawFlyAtlasChart(null, orderBySignal, useLinearScale, showSignal);
});

</script>

</c:if>

<!-- /spellExpressionDisplayer.jsp -->
