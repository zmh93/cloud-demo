INSERT INTO role (id, create_by, create_date, remark, role_name, update_by, update_date) VALUES (1, 'admin', '2018-06-06 18:52:54', null, 'admin', 'admin', '2018-06-06 18:52:54');
INSERT INTO role (id, create_by, create_date, remark, role_name, update_by, update_date) VALUES (2, 'admin', '2018-06-06 18:52:54', null, 'customer', 'admin', '2018-06-06 18:52:54');
INSERT INTO user (id, age, create_by, create_date, del_flag, email, password, photo, real_name, update_by, update_date, username) VALUES (1, 25, 'admin', '2018-06-06 18:52:54', 'N', '623299342@qq.com', '123', null, 'zhaomenghui', 'admin', '2018-06-06 18:53:51', 'admin');
INSERT INTO user (id, age, create_by, create_date, del_flag, email, password, photo, real_name, update_by, update_date, username) VALUES (2, 24, 'admin', '2018-06-06 18:52:54', 'N', '623299342@qq.com', '123', null, 'zhaomenghui', 'admin', '2018-06-06 18:52:54', 'user1');
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);