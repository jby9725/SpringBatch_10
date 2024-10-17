
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