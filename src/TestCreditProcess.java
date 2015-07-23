import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCreditProcess {
	private CreditProcess creditProcess;
	@Before
	public void setUp(){
		creditProcess=new CreditProcess();
	}

	@Test
	public void testGetCreditResult(){
		CreditResult creditResult=creditProcess.getCreditResult(true, true, true, 6, 10000);
		assertEquals("not equals reject",creditResult.getScoreResult(), ScoreResult.Approval);
	}
}
