do
$$
    begin
        if not exists(select from pg_type where typname = 'topic') then
            create type "topic" as enum ('ROMANCE','COMEDY', 'OTHER');
        end if;
    end
$$;

create table if not exists book
(
    id           varchar primary key,
    title        varchar,
    topic        topic,
    release_date date,
    page_numbers int,
    author_id    varchar,
    foreign key (author_id) references author (id)
);