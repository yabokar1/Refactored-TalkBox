package TalkBoxConfig;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AudioProfile {
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public String src;
	ArrayList<String> audioList;
	
	
	public AudioProfile() {
	
		this.src= "src/Audio/";
		this.audioList = new ArrayList<String>();
	}
	
	
	

	public ArrayList<String> ListofAudio() throws IOException {
	     FileInputOutput file = new FileInputOutput();
		for (File temp : file.finder(src)) {
			StringBuilder sb = new StringBuilder();
			sb.append(temp.getName());
			sb.delete(sb.length() - 4, sb.length()); // removes the .wav string
			this.audioList.add(sb.toString());
		}
		return this.audioList;

	}

	
	

}
