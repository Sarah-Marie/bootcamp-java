package coding_challenge_11;

public class StopWatchApp {

	public static void main(String[] args) {
		//WIP
		
		
		// create and app that tracks time- start tracking time when the user enters the word start 
		//stop tracking time when the user enters stop (stop watch)
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		stopWatch.stop();
		System.out.println(stopWatch.getTotalTimeMillis());

	}

}
