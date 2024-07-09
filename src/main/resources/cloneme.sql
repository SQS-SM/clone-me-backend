CREATE SCHEMA IF NOT EXISTS cloneme;

DROP TABLE IF EXISTS cloneme.errand CASCADE;
CREATE TABLE IF NOT EXISTS cloneme.errand (
    id                  SERIAL PRIMARY KEY,
    date_created        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status              VARCHAR(55) DEFAULT NULL,
    voice_note_id       VARCHAR(1024) DEFAULT NULL
);

DROP TABLE IF EXISTS cloneme.quote;
CREATE TABLE IF NOT EXISTS cloneme.quote (
    id                  SERIAL PRIMARY KEY,
    errand_id           BIGINT NOT NULL,
    cost                DECIMAL(10, 2) DEFAULT NULL,
    distance_estimate   DECIMAL(10, 2) DEFAULT NULL,
    time_estimate       INT DEFAULT NULL,
    date_created        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_errand
        FOREIGN KEY(errand_id)
            REFERENCES cloneme.errand(id)
            ON DELETE CASCADE
);

insert into cloneme.errand (id, status, voice_note_id) values (1, 'OPEN', 'filename');