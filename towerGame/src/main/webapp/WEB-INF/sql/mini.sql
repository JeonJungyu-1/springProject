
CREATE TABLE tower_member (
    member_id        VARCHAR2(20) PRIMARY KEY,
    member_password  VARCHAR2(20) NOT NULL,
    member_name      VARCHAR2(20) NOT NULL,
    member_photo     NUMBER(1) DEFAULT 1,
    member_level     NUMBER DEFAULT 1,
    member_attack    NUMBER DEFAULT 5,
    member_exp       NUMBER DEFAULT 0,
    member_boss      NUMBER DEFAULT 0
);

CREATE TABLE tower_monster (
    monster_num    NUMBER PRIMARY KEY,
    monster_name   VARCHAR2(100) NOT NULL,
    monster_hp     NUMBER NOT NULL,
    monster_boss   NUMBER NOT NULL,
    monster_photo  NUMBER NOT NULL
);

CREATE TABLE tower (
    tower_floor  NUMBER PRIMARY KEY,
    tower_photo  NUMBER NOT NULL,
    tower_boss   NUMBER NOT NULL
);

CREATE TABLE tower_board (
    board_title       VARCHAR2(100) PRIMARY KEY,
    board_context     VARCHAR2(4000) NOT NULL,
    board_lastindate  DATE DEFAULT sysdate,
    member_lastid     VARCHAR2(30) NOT NULL
        CONSTRAINT tower_board_fk
            REFERENCES tower_member ( member_id ),
    board_hits        NUMBER DEFAULT 0,
    board_original    VARCHAR2(300),
    board_saved       VARCHAR2(300)
);


INSERT INTO tower_member (
    member_id,
    member_password,
    member_name
) VALUES (
    'admin',
    '1234',
    '관리자'
);

INSERT INTO tower_board (
    board_title,
    board_context,
    member_lastid
) VALUES (
    '게임소개',
    '탑을 오르며 몬스터를 무찌르는 게임입니다.',
    'admin'
);

INSERT INTO tower_board (
    board_title,
    board_context,
    member_lastid
) VALUES (
    '공략법',
    '몬스터를 잡아서 레벨을 올리면 공격력도 올라갑니다.',
    'admin'
);

INSERT INTO tower_board (
    board_title,
    board_context,
    member_lastid
) VALUES (
    '몬스터',
    '9종의 일반몬스터와 4종의 보스몬스터가 랜덤으로 나옵니다. 보스몬스터는 5의 배수인 층에서 나옵니다.',
    'admin'
);
    
    
insert into tower_monster values(1, '일반몹', 5, 0, 1);
insert into tower_monster values(2, '일반몹', 5, 0, 2);
insert into tower_monster values(3, '일반몹', 5, 0, 3);
insert into tower_monster values(4, '일반몹', 5, 0, 4);
insert into tower_monster values(5, '일반몹', 5, 0, 5);
insert into tower_monster values(6, '일반몹', 5, 0, 6);
insert into tower_monster values(7, '일반몹', 5, 0, 7);
insert into tower_monster values(8, '일반몹', 5, 0, 8);
insert into tower_monster values(9, '일반몹', 5, 0, 9);
insert into tower_monster values(101, '보스몹', 5, 1, 1);
insert into tower_monster values(102, '보스몹', 5, 1, 2);
insert into tower_monster values(103, '보스몹', 5, 1, 3);
insert into tower_monster values(104, '보스몹', 5, 1, 4);
    
insert into tower values(1, 1, 0);
insert into tower values(2, 1, 0);
insert into tower values(3, 1, 0);
insert into tower values(4, 1, 0);
insert into tower values(5, 1, 1);
insert into tower values(6, 2, 0);
insert into tower values(7, 2, 0);
insert into tower values(8, 2, 0);
insert into tower values(9, 2, 0);
insert into tower values(10, 2, 1);
insert into tower values(11, 3, 0);
insert into tower values(12, 3, 0);
insert into tower values(13, 3, 0);
insert into tower values(14, 3, 0);
insert into tower values(15, 3, 1);


