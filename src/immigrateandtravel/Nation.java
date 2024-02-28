package immigrateandtravel;

import java.util.ArrayList;
import java.util.List;

public class Nation implements CheckImmigrationApproval{
    String countryName;
    String region;
    List<Citizen> citizens;  // Collection 타입 중 하나로 변경
    int requiredMoney;
    String restrictedRegion;

    public Nation(String countryName, String region, int numberOfCitizen,
                  int requiredMoney, String restrictedRegion) {
        this.countryName = countryName;
        this.region = region;
        this.citizens = new ArrayList<>(numberOfCitizen);
        this.requiredMoney = requiredMoney;
        this.restrictedRegion = restrictedRegion;
    }

    @Override
    public boolean checkAsylumRequest(Citizen citizen) {
        if (citizen.money < requiredMoney) {
            return false;
        } else if (citizen.currentRegion.equals(restrictedRegion)) {
            return false;
        } else {
            return !citizen.nationality.equals(restrictedRegion);
        }
    }
}