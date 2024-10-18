
## XAMPP에서 Shell로 DB 데이터 복사하기
- 명령어 : mysqldump -u root SpringBatch_10 | mysql -u root SpringBatch_10_back

## XAMPP에서 Shell로 쿼리문 빼내기
- 명령어
  1. start.
  2. mysqldump -u root SpringBatch_10 > SpringBatch_10.sql

## XAMPP에서 Shell로 쿼리문 백업본에 실행시키기 
- 명령어
  1. start .
  2. mysqldump -u root SpringBatch_10_backup < SpringBatch_10.sql
  3. (1015 동영상 참고)

---

### 공부한 시나리오 정리
- 회원 4명 샘플데이터 생성 (코드로 DB 컨트롤)
- 상품 2개 샘플데이터 생성 (코드로 DB 컨트롤)
- 상품에 대한 옵션 테이블도 생성함
- 장바구니 생성 
- 주문하기
  - 옵션 1 3개, 3 1개 -> 장바구니에 담음
  - 회원 1이 주문할거야
  - 주문데이터 -> 회원 1이 옵션 1 3개를, 3 1개를 주문한다.
  - 장바구니에서 주문목록으로 넘어간 데이터는 삭제한다.
  - 주문 데이터 생성
    - 주문은 1번. 주문 목록은 2개
    - 도매가, 권장판매가, 소비자가, 노출용 사이즈, 색상
  - 결제 개념 도입
    - Cash 도입, member1의 충전, 사용, 사유 기록
    - 예치금 도입, 예치금만으로 결제하기


---

### 공부 메모

@ManyToOne : 다대일 관계
다수의 엔티티가 하나의 엔티티에 연결되는 상황에서 필수
OrderItem(주문 항목)은 Order(주문)에 속한다.
-> OrderItem이 Order를 참조해야해.

@OneToMeny : 일대다 관계
하나의 엔티티가 여러 하위 엔티티를 가질 때 필수
하나의 Order(주문)가 여러 OrderItem(주문 항목)을 가진다.
