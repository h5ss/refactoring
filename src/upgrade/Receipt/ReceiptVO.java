package upgrade.Receipt;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
@AllArgsConstructor
public class ReceiptVO {
    private int rec_Id; // 입고 ID
    private String datetime;
    private int p_quantity; // 상품 수량
    private int state;      // 활성화, 비활성화
    private int qrCode;     // qrCode
    private int approval;       // 입고 요청 승인 여부
    private int uId;        // 회원의 ID가 아닌 회원 자체의 정보 ID?
    private int pId;        // 상품 ID
    private int wId;        // 창고 선택 ID

    ReceiptVO() {
    }
}
