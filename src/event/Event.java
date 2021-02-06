package event;

import Charactor.*;

public class Event {
			public static boolean checkHit(Dog dog,Wave wave,int dogSize,int waveHeight){
							if(dog.x+dogSize>wave.x&&dog.x<wave.x) {
								if(dog.y+dogSize>=wave.y-waveHeight) {
									return true;
								}
							}
							return false;
			}
			
			public static void gameStop(Wave[] wave,Environment[] env) {

			}

}
