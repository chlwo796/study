CREATE TABLE TBL_VOTE_202005( -- 투표이력테이블 명세서
    V_JUMIN CHAR(13) NOT NULL PRIMARY KEY, -- 주민번호
    V_NAME VARCHAR2(20), -- 성명
    M_NO CHAR(1), -- 후보번호
    V_TIME CHAR(4), -- 투표시간
    V_AREA CHAR(20), -- 투표장소
    V_CONFIRM CHAR(1) -- 유권자확인
);

CREATE TABLE TBL_MEMBER_202005( -- 후보자테이블 명세서
    M_NO CHAR(1) NOT NULL PRIMARY KEY, -- 후보번호
    M_NAME VARCHAR2(20), -- 성명
    P_CODE CHAR(2), -- 소속정당
    P_SCHOOL CHAR(1), -- 최종학력
    M_JUMIN CHAR(13), -- 주민번호
    M_CITY VARCHAR2(20) -- 지역구
);

CREATE TABLE TBL_PARTY_202005( -- 정당코드테이블 명세서
    P_CODE CHAR(2) NOT NULL PRIMARY KEY, -- 정당코드
    P_NAME VARCHAR2(20), -- 명칭
    P_INDATE DATE, -- 등록연월일
    P_READER VARCHAR2(20), -- 대표자
    P_TEL1 CHAR(3), -- 전화번호1
    P_TEL2 CHAR(4), -- 전화번호2
    P_TEL3 CHAR(4) -- 전화번호3
);

INSERT INTO TBL_VOTE_202005 VALUES ('99010110001', '김유권', '1', '0930', '제1투표장', 'N');
INSERT INTO TBL_VOTE_202005 VALUES ('89010120002', '이유권', '2', '0930', '제1투표장', 'N');
INSERT INTO TBL_VOTE_202005 VALUES ('69010110003', '박유권', '3', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('59010120004', '홍유권', '4', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010110005', '조유권', '5', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('89010120006', '최유권', '1', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('59010110007', '지유권', '1', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('49010120008', '장유권', '3', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010110009', '정유권', '3', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('89010120010', '강유권', '4', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('99010110011', '신유권', '5', '0930', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010120012', '오유권', '1', '1130', '제1투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('69010110013', '현유권', '4', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('89010110014', '왕유권', '2', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('99010110015', '유유권', '3', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010110016', '한유권', '2', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('89010110017', '문유권', '4', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('99010110018', '양유권', '2', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('99010110019', '구유권', '4', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010110020', '황유권', '5', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('69010110021', '배유권', '3', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('79010110022', '전유권', '3', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('99010110023', '고유권', '1', '1130', '제2투표장', 'Y');
INSERT INTO TBL_VOTE_202005 VALUES ('59010110024', '권유권', '3', '1130', '제2투표장', 'Y');

INSERT INTO TBL_MEMBER_202005 VALUES ('1' ,'김후보', 'P1', '1', '6603011999991', '수선화동');
INSERT INTO TBL_MEMBER_202005 VALUES ('2' ,'이후보', 'P2', '3', '5503011999992', '민들래동');
INSERT INTO TBL_MEMBER_202005 VALUES ('3' ,'박후보', 'P3', '2', '7703011999993', '나팔꽃동');
INSERT INTO TBL_MEMBER_202005 VALUES ('4' ,'조후보', 'P4', '2', '8803011999994', '진달래동');
INSERT INTO TBL_MEMBER_202005 VALUES ('5' ,'최후보', 'P5', '3', '9903011999995', '개나리동');

INSERT INTO TBL_PARTY_202005 VALUES ('P1', 'A정당', '2010-01-01', '위대표', '02', '1111', '0001');
INSERT INTO TBL_PARTY_202005 VALUES ('P2', 'B정당', '2010-02-01', '명대표', '02', '1111', '0002');
INSERT INTO TBL_PARTY_202005 VALUES ('P3', 'C정당', '2010-03-01', '기대표', '02', '1111', '0003');
INSERT INTO TBL_PARTY_202005 VALUES ('P4', 'D정당', '2010-04-01', '옥대표', '02', '1111', '0004');
INSERT INTO TBL_PARTY_202005 VALUES ('P5', 'E정당', '2010-05-01', '임대표', '02', '1111', '0005');

SELECT * FROM TBL_VOTE_202005;
SELECT * FROM TBL_MEMBER_202005;
SELECT * FROM TBL_PARTY_202005;

COMMIT;

SELECT m.M_NO, m.M_NAME, p.P_NAME, m.P_SCHOOL, m.M_JUMIN,
m.M_CITY, p.P_TEL1, p.P_TEL2, 
p.P_TEL3 FROM TBL_MEMBER_202005 m, TBL_PARTY_202005 p
WHERE m.P_CODE = p.P_CODE;

-- 유권자확인이 Y이면서, 각 후보번호 별 후보이름, Y일 때 카운팅1

SELECT m.M_NO, m.M_NAME, COUNT(CASE WHEN v.V_CONFIRM = 'Y' THEN 1 END) V_COUNT FROM TBL_VOTE_202005 v, TBL_MEMBER_202005 m
WHERE v.M_NO = m.M_NO AND v.V_CONFIRM = 'Y' GROUP BY m.M_NO, m.M_NAME ORDER BY V_COUNT DESC;

