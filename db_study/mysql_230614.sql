SELECT * FROM BABSANG_INFO;
SELECT * FROM COMMENT_INFO;
SELECT * FROM USER_INFO;

SELECT last_insert_id(BI_NUM) FROM BABSANG_INFO;

INSERT INTO USER_INFO (UI_NICKNAME, UI_PWD, UI_FILEPATH, UI_GENDER, 
UI_AGE, BI_NUM, UI_CREDAT, UI_ID, 
UI_ACTIVE, UI_DEL) VALUES
('관리자', '1111', '/resources/upload/관리자사진.png', 0, 30, 0, NOW(), 'Administer', 0, null);

SELECT * FROM USER_INFO;
SELECT * FROM KAKAO_USER_INFO;
DELETE FROM USER_INFO WHERE UI_NUM = 93;

commit;

SELECT ui.UI_NUM, ui.UI_NICKNAME, ui.UI_PWD, ui.UI_FILEPATH, 
ui.UI_GENDER, ui.UI_AGE, ui.BI_NUM, ui.UI_CREDAT, 
ui.UI_ID, ui.UI_ACTIVE, ui.UI_DEL, kui.KUI_ID FROM USER_INFO ui, KAKAO_USER_INFO kui WHERE ui.UI_NUM = kui.UI_NUM;

UPDATE USER_INFO SET BI_NUM = 81 WHERE UI_NUM = 2;

SELECT * FROM USER_INFO WHERE BI_NUM = 81;

SELECT * FROM BABSANG_INFO WHERE UI_NUM = 30;

SELECT ui.UI_NUM, ui.UI_NICKNAME, ui.UI_PWD, ui.UI_FILEPATH, 
ui.UI_GENDER, ui.UI_AGE, ui.BI_NUM, ui.UI_CREDAT, 
ui.UI_ID, ui.UI_ACTIVE, ui.UI_DEL 
FROM BABSANG_INFO bi, USER_INFO ui WHERE bi.UI_NUM = ui.UI_NUM and bi.BI_NUM = ui.BI_NUM;