package contract;

import java.util.Observable;
import entity.Map;


public interface IModel {

	Map getMap();
	void loadMap(int id);
	Observable getObservable();
	void modelNotify();
	void loop();

}
