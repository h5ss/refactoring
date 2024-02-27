package upgrade.Receipt;

import upgrade.UserVO;

public class ReceiptMain {
    public static void main(String[] args) throws Exception{
        ReceiptService rs = new ReceiptService();
        UserVO user1 = new UserVO(1004,2,"user",
                "1004","hs","405","서울",105,true);
        rs.ReceiptMenu(user1);
    }
}
