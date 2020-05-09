package utils;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

import org.junit.Test;

import eatfish.World;


public class MusicUtil {
	@Test
	public void test() {
		
		String s1=World.class.getResource("BGM.mp3").toString();
		System.out.println("TEST:"+new File(s1).getName());
		
		String[] s2=s1.split("file:/");
		System.out.println(s2[1]);
	}
    public static void play(){
//        程序外的本地文件应该使用URI地址
    	String s1=World.class.getResource("BGM.mp3").toString();
		String[] s2=s1.split("file:/");
    	//File f = new File("D:\\kjk\\workspace\\eatfish\\src\\eatfish\\纯音乐 - 魔法密林.mp3");
		File f = new File(s2[1]);
		
        Media _media = new Media(f.toURI().toString());
        //        必须有这一行，并且要在MediaPlayer创建之前
        final JFXPanel fxPanel = new JFXPanel();
        MediaPlayer _mediaPlayer = new MediaPlayer(_media);
        _mediaPlayer.play();
    }
}