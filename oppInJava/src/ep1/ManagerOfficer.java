package ep1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer1(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByName1(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }

	public Iterable<Officer> searchOfficerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOfficer(Officer engineer) {
		// TODO Auto-generated method stub
		
	}
}
