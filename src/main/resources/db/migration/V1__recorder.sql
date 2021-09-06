CREATE TABLE recorder (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL
);

CREATE TABLE world_record (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(255) NOT NULL,
  value DOUBLE NOT NULL,
  unit_of_measure VARCHAR(255) NOT NULL,
  date_of_record DATE NOT NULL,
  recorder_id BIGINT NOT NULL,
  CONSTRAINT fk_recorder_id FOREIGN KEY (recorder_id) REFERENCES recorder (id) ON UPDATE CASCADE ON DELETE CASCADE
);