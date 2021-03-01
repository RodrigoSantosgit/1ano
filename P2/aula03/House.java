import java.util.*;
import static java.lang.System.*;

public class House {
	private String tipoh;
	private int adicsize;
	private int size=0;
	private int ndiv=8;
	Room[] rooms;
	
	public House(String tipoh){
		this.tipoh=tipoh;
		rooms = new Room[ndiv];
		this.adicsize=4;
		this.size=0;
		}
	public House(String tipoh, int size, int adicsize){
		this.tipoh=tipoh;
		this.ndiv=size;
		this.adicsize=adicsize;
		rooms = new Room[size];
		}
	
	public String tipoh(){
		return this.tipoh;
		}
	
	public int size(){
		return this.size;
		}
	
	public int maxSize(){
		return rooms.length;
		}		
	public void addRoom(Room newroom){
		if(size()==ndiv){
			Room[] novo = new Room[ndiv+adicsize];
			arraycopy(rooms,0,novo,0,ndiv);
			rooms=novo;
			ndiv+=adicsize;
			}
		rooms[size++]=newroom;	
		}
	
	public Room room(int i){
		return rooms[i];
		}
	
	public double area2(){
		double areatotal=0;
		for(int i=0; i<size;i++){
			areatotal+=rooms[i].area();
			}
		return areatotal;
		}			
	
	public RoomTypeCount[] getRoomTypeCounts(){ 
		RoomTypeCount[] temp = new RoomTypeCount[size];
		int trueSize = 0;
		
		for(int i=0;i<size;i++){
			boolean found = false;
			int index = -1;
			for(int j = 0; j < trueSize; j++)
			{
				if(temp[j].roomType.equals(rooms[i].roomType()))
				{
					found = true;
					index = j;
					break;
				}
			}
			
			if(found)
			{
				temp[index].count = temp[index].count + 1;
			}
			else
			{
				RoomTypeCount r = new RoomTypeCount(rooms[i].roomType(), 1);
				temp[trueSize] = r;
				trueSize++;
			}
			
		}
			
		RoomTypeCount[] novo = new RoomTypeCount[trueSize];
		for(int i = 0; i < trueSize; i++)
		{
			novo[i] = temp[i];
		}
		return novo;	
	}
	
	public double averageRoomDistance(){
		double distance=0;
		for(int i =0; i<size;i++){
			for(int j=i-1;j>=0;j--){
				distance+=rooms[i].geomCenter().distTo(rooms[j].geomCenter());
				}
			}
		return distance;
		}
		
}

