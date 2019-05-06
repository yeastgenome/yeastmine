package org.yeastmine.web.displayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.intermine.api.InterMineAPI;
import org.intermine.web.displayer.ReportDisplayer;
import org.intermine.web.logic.config.ReportDisplayerConfig;
import org.intermine.web.logic.results.ReportObject;
import org.intermine.model.InterMineObject;
import org.intermine.model.bio.Gene;
import org.intermine.model.bio.ORF;
import org.intermine.model.bio.ExpressionScore;
import org.intermine.model.InterMineObject;
import org.intermine.metadata.Util;


public class SpellExpressionDisplayer extends ReportDisplayer {
	
    private static final Logger LOG = Logger.getLogger(SpellExpressionDisplayer.class);

	public SpellExpressionDisplayer(ReportDisplayerConfig config,
			InterMineAPI im) {
		super(config, im);
	}

	@Override
	public void display(HttpServletRequest request, ReportObject reportObject) {
		
		InterMineObject object = reportObject.getObject();
		Set<ExpressionScore> expressions = null;
		
		//LOG.info("object type is :  " + object.getClass());
		
		if (object instanceof Gene) {
			
		Gene gene = (Gene) object;      
		 expressions = gene.getExpressionScores();
		 //LOG.error("object is instance of Gene");
		 //LOG.error("expressions count is :  " + expressions.size());
		 
		} else if (object instanceof ORF) {
				
			ORF orf = (ORF) object;      
			expressions = orf.getExpressionScores();
			//LOG.error("object is instance of ORF :  " + object.getClass());
			//LOG.error("expressions count is :  " + expressions.size());
			
		}
		
		List<Integer> results = new ArrayList<Integer>();
		
		//List<Double> Zero = new ArrayList<Double>();
		
		List<Double> ZeroToTwo = new ArrayList<Double>();
		List<Double> TwoToFour = new ArrayList<Double>();
		List<Double> FourToSix = new ArrayList<Double>();
		List<Double> SixToEight = new ArrayList<Double>();
		List<Double> EightToTen = new ArrayList<Double>();
		List<Double> TenToTwelve = new ArrayList<Double>();
		List<Double> TwelveToFourteen = new ArrayList<Double>();
		List<Double> FourteenToSixteen = new ArrayList<Double>();
		List<Double> SixteenToEighteen = new ArrayList<Double>();
		List<Double> EighteenToTwenty = new ArrayList<Double>();
		List<Double> TwentyUp = new ArrayList<Double>();
		
		List<Double> ZeroToNegTwo = new ArrayList<Double>();
		List<Double> NegTwoToNegFour = new ArrayList<Double>();
		List<Double> NegFourToNegSix = new ArrayList<Double>();
		List<Double> NegSixToNegEight = new ArrayList<Double>();
		List<Double> NegEightToNegTen = new ArrayList<Double>();
		List<Double> NegTenToNegTwelve = new ArrayList<Double>();
		List<Double> NegTwelveToNegFourteen = new ArrayList<Double>();
		List<Double> NegFourteenToNegSixteen = new ArrayList<Double>();
		List<Double> NegSixteenToNegEighteen = new ArrayList<Double>();
		List<Double> NegEightteenToNegTwenty = new ArrayList<Double>();
		List<Double> NegTwentyDown = new ArrayList<Double>();
		
		
		for (ExpressionScore se: expressions) {
		
			Float flt_score =  se.getScore();
			if(flt_score != null) {
						
			double dbscore = flt_score.doubleValue();
			Double score = new Double(dbscore);
				
			if (score > 0.0 && score <= 2.0) {
				ZeroToTwo.add(score);
			}else if (score >= 2.0 && score <= 4.0) {
				TwoToFour.add(score);
			}else if (score >= 4.0 && score <= 6.0) {
				FourToSix.add(score);
			}else if (score >= 6.0 && score <= 8.0) {
				SixToEight.add(score);
		    }else if (score >= 8.0 && score <= 10.0) {
		    	EightToTen.add(score);
		    }else if (score >= 10.0 && score <= 12.0) {
		    	TenToTwelve.add(score);
		    }else if (score >= 12.0 && score <= 14.0) {
		    	TwelveToFourteen.add(score);
		    }else if (score >= 14.0 && score <= 16.0) {
		    	FourteenToSixteen.add(score);
		    }else if (score >= 16.0 && score <= 18.0) {
		    	SixteenToEighteen.add(score);
		    }else if (score >= 18.0 && score <= 20.0) {
		    	EighteenToTwenty.add(score);
		    }else if (score > 20.0) {
		    	TwentyUp.add(score);
		    }else if (score < 0.0 && score >= -2.0) {
				ZeroToNegTwo.add(score);
			}else if (score < -2.0 && score >= -4.0) {
				NegTwoToNegFour.add(score);
			}else if (score < -4.0 && score >= -6.0) {
				NegFourToNegSix.add(score);
			}else if (score < -6.0 && score >= -8.0) {
				NegSixToNegEight.add(score);
			}else if (score < -8.0 && score >= -10.0) {
				NegEightToNegTen.add(score);
			}else if (score < -10.0 && score >= -12.0) {
				NegTenToNegTwelve.add(score);
			}else if (score < -12.0 && score >= -14.0) {
				NegTwelveToNegFourteen.add(score);
			}else if (score < -14.0 && score >= -16.0) {
				NegFourteenToNegSixteen.add(score);
			}else if (score < -16.0 && score >= -18.0) {
				NegSixteenToNegEighteen.add(score);
			}else if (score < -18.0 && score >= -20.0) {
				NegEightteenToNegTwenty.add(score);
			}else if (score < -20.0) {
				NegTwentyDown.add(score);
			}
			
			} 

		}
				
	
		results.add(new Integer(NegTwentyDown.size()));
		results.add(new Integer(NegEightteenToNegTwenty.size()));
		results.add(new Integer(NegSixteenToNegEighteen.size()));
		results.add(new Integer(NegFourteenToNegSixteen.size()));
		results.add(new Integer(NegTwelveToNegFourteen.size()));
		results.add(new Integer(NegTenToNegTwelve.size()));
		results.add(new Integer(NegEightToNegTen.size()));
		results.add(new Integer(NegSixToNegEight.size()));
		results.add(new Integer(NegFourToNegSix.size()));
		results.add(new Integer(NegTwoToNegFour.size()));	
		results.add(new Integer(ZeroToNegTwo.size()));	
		
		//results.add(new Integer(Zero.size()));
		
		results.add(new Integer(ZeroToTwo.size()));	
		results.add(new Integer(TwoToFour.size()));	
		results.add(new Integer(FourToSix.size()));	
		results.add(new Integer(SixToEight.size()));
		results.add(new Integer(EightToTen.size()));
		results.add(new Integer(TenToTwelve.size()));
		results.add(new Integer(TwelveToFourteen.size()));
		results.add(new Integer(FourteenToSixteen.size()));
		results.add(new Integer(SixteenToEighteen.size()));
		results.add(new Integer(EighteenToTwenty.size()));
		results.add(new Integer(TwentyUp.size()));
					
		request.getSession().setAttribute("expressionScoreCounts", results.toString());
		
	}

}
