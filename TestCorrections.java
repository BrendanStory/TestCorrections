public class TestCorrections {
	
	// 1A

	int x = word1.length/2;
	int y = word2.length/2;
	
	String combine = "";

	public void recombine(String word1, String word2){

		combine = substring(0,word1(x)) + substring(word2(y),word2.length);
		
		//Missing something here and then something which each substring above.

		return combine;
	}

	// 1B
	
	String new = null;

		//Missing something at the beginning here

	public void mixedWords(String[]words){
		for(k = 0; k < words.length; k = k+2){
			String w1 = recombine(words(k), words(k+1));
			String w2 = recombine(words(k+1), words(k));
			return w1;
			return w2;
		}
}
	// 2A
	
	int peak = null;

	public void getPeakIndex(){
		for(k = 1; k =< array.length-1; k++){
			if (array[k] > array[k-1] && array[k] > array[k+1])
				peak == array[k];
				break();
		}
		if (peak =/= null){
			return peak;
		} else {
			return -1;
		}
	}

	// 2B

	public void isMountain(){
		if (getPeakIndex =/= -1 && side1 == true && side2 == true) {
			return true;
		} else {
			return false.
		}
	}

	//This is basically my code without the different methods I added. 
	//Don't know if this is what was being looked for, but its what I had,
	//and seemed to be fine.

}