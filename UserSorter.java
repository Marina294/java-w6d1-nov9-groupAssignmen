package marina1109w6d1assignment;

public class UserSorter {
	public static class CompareById implements Comparator<User>{

		@Override
		public int compare(User o1, User o2) {
			return o1.getId().compareTo(o2.getId());
		}
		
	}
	
	public static class CompareByFirstName implements Comparator<User> {

		@Override
		public int compare(User o1, User o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		
	}
	
	public static class CompareByLastName implements Comparator<User> {

		@Override
		public int compare(User o1, User o2) {
			return o1.getLastName().compareTo(o2.getLastName());
	}

}
