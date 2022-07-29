package DemoO.Client;

import DemoO.ClaimApprovalManager;
import DemoO.Model.HealthInsuranceSurveyor;
import DemoO.Model.VehicleInsuranceSurveyor;

public class ClaimApprovalManagerTest {
    public static void main(String[] args) throws Exception {
//        Không dùng O:
//        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
//        ClaimApprovalManager claim1 = new ClaimApprovalManager();
//        claim1.processHealthClaim(healthInsuranceSurveyor);
//        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
//        ClaimApprovalManager claim2 = new ClaimApprovalManager();
//        claim2.processVehicleClaim(vehicleInsuranceSurveyor);

//        Có dùng O:
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1 = new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2 = new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}