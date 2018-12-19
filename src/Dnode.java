
public class Dnode {
	int data;
	Dnode next,prev;
	public Dnode(){
		data=0;
		next=null;
		prev=null;
	}
	public void setPrev(Dnode p){
		prev=p;
	}
	public void setNext(Dnode n){
		next=n;
	}

}
