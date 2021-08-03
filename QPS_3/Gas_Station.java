package QPS_3;

public class Gas_Station {
	public static void main(String[] args) {

	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int start_station =0;
		int Total_sum =0;
		int Curr_part =0;
		for(int i=0;i<gas.length;i++) {
			Total_sum += gas[i]-cost[i];
			
			Curr_part += gas[i]-cost[i];
			
			if(Curr_part<0) {
				Curr_part=0;
				start_station = i+1;
			}
		}
		if(Total_sum<0) {
			return -1;
		}
		else {
			return start_station;
		}
	}
}
