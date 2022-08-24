

INSERT INTO project(project_name, estimated_hours, actual_hours, difficulty, notes) VALUES ('build a cat city', 2, 1, 2, 'great for cats');
INSERT INTO material(project_id, material_name, num_required, cost) VALUES (4, 'cardboard', 2, 3.50);
INSERT INTO material(project_id, material_name, num_required, cost) VALUES (1, 'nails', 25, 5.00);
INSERT INTO material(project_id, material_name, num_required, cost) VALUES (2, 'shovel', 1, 10.00);
INSERT INTO step (project_id, step_text, step_order) VALUES (1, 'dig a hole', 1);
INSERT INTO step (project_id, step_text, step_order) VALUES (2, 'cut wooden boards', 1);
INSERT INTO category (category_id, category_name) VALUES (1, ' household jobs');
INSERT INTO category (category_id, category_name) VALUES (2, 'outside jobs');
INSERT INTO category (category_id, category_name) VALUES (3, 'miscellaneous');
INSERT INTO project_category (project_id, category_id) VALUES (1,1);
INSERT INTO project_category (project_id, category_id) VALUES (2,2);
