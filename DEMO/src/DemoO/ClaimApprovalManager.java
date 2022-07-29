package DemoO;

import DemoO.Model.HealthInsuranceSurveyor;
import DemoO.Model.VehicleInsuranceSurveyor;

public class ClaimApprovalManager {
    //    Không dùng O:
//    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
//        if (surveyor.isValidClaim()) {
//            System.out.println("Hiện tại đơn bảo hiểm đã được chấp nhận");
//        }
//    }
////
//    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
//        if (surveyor.isValidClaim()) {
//            System.out.println("Hiện tại đơn bảo hiểm đã được chấp nhận");
//        }
//    }

//    Có dùng O:
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("Hiện tại đơn bảo hiểm đã được chấp nhận");
        }
    }
}
//nếu muốn xử lý bảo hiểm xe cộ thì phải