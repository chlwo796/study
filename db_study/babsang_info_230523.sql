create table exam (
	id int
);

DESC BABSANG_INFO;

CREATE TABLE BABSANG_INFO(
BI_NUM INT PRIMARY KEY NOT NULL auto_increment,
BI_TITLE VARCHAR(100) NOT NULL,
BI_CONTENT TEXT,
BI_MEETINGDAT DATE NOT NULL DEFAULT (current_date()),
BI_MEETINGTIM TIME NOT NULL DEFAULT (current_time()),
BI_HEADCNT INT NOT NULL,
BI_CREDAT DATETIME NOT NULL DEFAULT NOW(),
BI_FDCATEGORY VARCHAR(20) NOT NULL,
BI_CLOSED BOOLEAN NOT NULL DEFAULT FALSE,
UI_NUM INT NOT NULL,
foreign key (UI_NUM) REFERENCES USER_INFO(UI_NUM)
);

SELECT * FROM BABSANG_INFO;

SELECT * FROM USER_INFO;

SELECT * FROM COMMENT_INFO;
DESC BABSANG_INFO;


INSERT INTO BABSANG_INFO (BI_TITLE, BI_CONTENT, BI_MEETINGDAT, BI_MEETINGTIM,
BI_HEADCNT, BI_FDCATEGORY, BI_CLOSED, UI_NUM) VALUES(
'롯데리아뿌실분', '내일 저녁 6시 롯데리아 ㄱㄱ', '2023-05-24', '20:00:00',
6, '버거', FALSE, 2), (
'오늘저녁번개소주팟', '1시간 뒤 미사역시계탑ㄱㄱㄱ', '2023-05-22', '23:00:00',
4, '야식', FALSE, 3)
;

ALTER TABLE BABSANG_INFO MODIFY BI_MEETINGDAT date NOT NULL DEFAULT(current_date());
ALTER TABLE BABSANG_INFO MODIFY BI_MEETINGTIM TIME NOT NULL DEFAULT(current_time());

ALTER TABLE USER_INFO ADD UI_CREDAT DATETIME NOT NULL DEFAULT NOW();
ALTER TABLE BABSANG_INFO MODIFY BI_CLOSED BOOLEAN NOT NULL DEFAULT FALSE;
DROP TABLE COMMENT_INFO;

CREATE TABLE COMMENT_INFO(
CI_NUM INT PRIMARY KEY AUTO_INCREMENT,
CI_CONTENT TEXT NOT NULL,
CI_CREDAT DATETIME NOT NULL DEFAULT NOW(),
CI_CRETIM DATETIME NOT NULL DEFAULT NOW(),
UI_NUM INT REFERENCES USER_INFO(UI_NUM),
BI_NUM INT REFERENCES BABSANG_INFO(BI_NUM));

INSERT INTO COMMENT_INFO(CI_CONTENT, UI_NUM, BI_NUM) VALUES
('오늘 약간 늦을 것 같아요', 1, 1);
INSERT INTO COMMENT_INFO(CI_CONTENT, UI_NUM, BI_NUM) VALUES
('얼마나 늦으세요??', 2, 1);
INSERT INTO COMMENT_INFO(CI_CONTENT, UI_NUM, BI_NUM) VALUES
('지하철 시위때문에 잘 모르겠어요 ㅠ', 1, 1);

DELETE FROM COMMENT_INFO WHERE CI_NUM=3;

SELECT * FROM COMMENT_INFO;
SELECT * FROM BABSANG_INFO;
SELECT * FROM USER_INFO;

DESC USER_INFO;

SELECT BI_NUM, BI_TITLE, BI_CONTENT, BI_MEETINGDAT, 
BI_HEADCNT, BI_CREATEDAT, BI_FDCATEGORY, BI_CLOSED, 
UI_NUM FROM BABSANG_INFO WHERE BI_NUM = 3;
DESC BABSANG_INFO;

DELETE FROM USER_INFO WHERE UI_NUM = 92;

SELECT COUNT(*) COUNT_USER, COUNT(CASE WHEN UI_GENDER=1 THEN 1 END) COUNT_MALE FROM USER_INFO;
SELECT COUNT(*) FROM USER_INFO WHERE BI_NUM = 1;

SELECT UI_NUM, UI_NICKNAME, UI_PWD, UI_FILEPATH, UI_GENDER, UI_AGE, BI_NUM, UI_CREDAT, UI_ID, UI_ACTIVE, UI_DEL, COUNT(*) FROM USER_INFO WHERE BI_NUM = 1;