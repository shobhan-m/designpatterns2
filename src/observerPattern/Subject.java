package observerPattern;


public interface Subject {

	//methods to register and unregister observers and notify
	
	public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();


}
