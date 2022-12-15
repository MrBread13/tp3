public class StartDate {

	private String day = "15";
	private String month = "Decembre";
	private String year = "2022";

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Travail commencé le ");
		sb.append(day);
		sb.append(" ");
		sb.append(month);
		sb.append(" ");		
		sb.append(year);	
		return sb.toString();
	}

}
