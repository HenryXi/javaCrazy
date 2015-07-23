
public class CreditProcess {

	public CreditResult getCreditResult(boolean badHistory,Boolean dead,Boolean inEurope,int score,int yearlyIncome){
		CreditResult creditResult=new CreditResult();
		if(badHistory==true || dead==true || inEurope==false){
			creditResult.setScoreResult(ScoreResult.Reject);
		}else if(score>8){
			creditResult.setScoreResult(ScoreResult.Reject);
		}else if(score>6 && score<8){
			creditResult.setScoreResult(ScoreResult.Referral);
		}else if(score>0 && score<6){
			creditResult.setScoreResult(ScoreResult.Approval);
		}
		
		return creditResult;
	}
}
