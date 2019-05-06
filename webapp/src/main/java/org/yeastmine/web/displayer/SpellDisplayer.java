package org.yeastmine.web.displayer;

/*
 * Copyright (C) 2002-2011 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.intermine.api.InterMineAPI;
import org.intermine.api.profile.Profile;
import org.intermine.api.query.PathQueryExecutor;
import org.intermine.pathquery.Constraints;
import org.intermine.pathquery.PathQuery;
import org.intermine.web.displayer.ReportDisplayer;
import org.intermine.web.logic.config.ReportDisplayerConfig;
import org.intermine.web.logic.results.ReportObject;
import org.intermine.web.logic.session.SessionMethods;
import org.intermine.webservice.server.output.JSONResultsIterator;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.webservice.server.query.result.PathQueryBuilderForJSONObj;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.log4j.Logger;

/**
 * Displayer for flyatlas expression data.
 * @author Alex
 */
public class SpellDisplayer extends ReportDisplayer{

	protected static final Logger LOG = Logger.getLogger(SpellDisplayer.class);

	/**
	 * @param config configuration object
	 * @param im intermine API
	 */
	public SpellDisplayer(ReportDisplayerConfig config, InterMineAPI im) {
		super(config, im);
	}

	@Override
	public void display(HttpServletRequest request, ReportObject reportObject) {

		Profile profile = SessionMethods.getProfile(request.getSession());
		PathQueryExecutor executor = im.getPathQueryExecutor(profile);

		PathQuery q = new PathQuery(im.getModel());
		q.addViews("Gene.spellExpressionScores.spelldatasetcondition.conditionname",
		"Gene.spellExpressionScores.score");
		Integer objectId = reportObject.getId();
		q.addConstraint(Constraints.eq("Gene.id", objectId.toString()));
		q.addConstraint(Constraints.isNotNull("Gene.spellExpressionScores.score"));

		q = PathQueryBuilderForJSONObj.processQuery(q);

		List<Integer> results = new ArrayList<Integer>();
		//List<String> conditions = new ArrayList<String>();

		List<Double> ZeroToTwo = new ArrayList<Double>();
		List<Double> TwoToFour = new ArrayList<Double>();
		List<Double> FourToSix = new ArrayList<Double>();
		List<Double> SixToEight = new ArrayList<Double>();

		List<Double> ZeroToNegTwo = new ArrayList<Double>();
		List<Double> NegTwoToNegFour = new ArrayList<Double>();
		List<Double> NegFourToNegSix = new ArrayList<Double>();
		List<Double> NegSixToNegEight = new ArrayList<Double>();

		JSONResultsIterator jsonIterator = null;
		try{
			 jsonIterator = new JSONResultsIterator(executor.execute(q));
		}catch(ObjectStoreException e){
			//throw new ObjectStoreException(e);
		}

		while (jsonIterator.hasNext()) {
			//LOG.info("Iterating over JSON results..is it getting any?");
			try {

				JSONObject gene = jsonIterator.next();
				JSONArray microArrayResults = gene.getJSONArray("spellExpressionScores");

				for (int i = 0; i < microArrayResults.length(); i++) {

					JSONObject flyAtlasResult = microArrayResults.getJSONObject(i);
					//conditions.add("\"" + flyAtlasResult.getJSONObject("spelldatasetcondition").getString("conditionname") + "\"");
					Double score = (flyAtlasResult.optDouble("score"));

					if (score >= 0.0 && score <= 2.0) {
						ZeroToTwo.add(score);
					} if (score >= 2.0 && score <= 4.0) {
						TwoToFour.add(score);
					}if (score >= 4.0 && score <= 6.0) {
						FourToSix.add(score);
					}if (score >= 6.0 && score <= 8.0) {
						SixToEight.add(score);
					}if (score < 0.0 && score >= -2.0) {
						ZeroToNegTwo.add(score);
					}if (score < -2.0 && score >= -4.0) {
						NegTwoToNegFour.add(score);
					}if (score < -4.0 && score >= -6.0) {
						NegFourToNegSix.add(score);
					}if (score < -6.0 && score >= -8.0) {
						NegSixToNegEight.add(score);
					}

					//LOG.info("Iterating over JSON results.. Condition " + flyAtlasResult.getJSONObject("spelldatasetcondition").getString("conditionname") );
					LOG.info("Iterating over JSON results.. Score "+ flyAtlasResult.optDouble("score") );
				}
			} catch (JSONException e) {
				//
			}		
		
		}

		results.add(new Integer(ZeroToTwo.size()));	
		results.add(new Integer(TwoToFour.size()));	
		results.add(new Integer(FourToSix.size()));	
		results.add(new Integer(SixToEight.size()));	

		results.add(new Integer(ZeroToNegTwo.size()));	
		results.add(new Integer(NegTwoToNegFour.size()));	
		results.add(new Integer(NegFourToNegSix.size()));	
		results.add(new Integer(NegSixToNegEight.size()));	

		
		LOG.info("size of results: " + results.size());
		

		request.setAttribute("expressionScoreCounts", results.toString());
	//request.setAttribute("conditions", conditions);
		
	}

}
