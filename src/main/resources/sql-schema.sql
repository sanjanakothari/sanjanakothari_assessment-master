drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) NOT NULL,
    `value` NUMERIC(8, 2) NOT NULL
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
    `order_id` INT(11) NOT NULL,
    `item_id` INT(11) NOT NULL,
    `product_quantity` INT(11) NOT NULL
    `customer_id` INT(11) NOT NULL,
    PRIMARY KEY (`order_id`, `item_id`),
    FOREIGN KEY (`customer_id`) REFERENCES `ims`.`customers`(`customer_id`),
    FOREIGN KEY (`item_id`) REFERENCES `ims`.`items`(`id`),
    CONSTRAINT nonzeroOP CHECK (`product_quantity` > 0)
);

-- CREATE TABLE IF NOT EXISTS `ims`.`orders` (
--     `order_id` INT(11) NOT NULL AUTO_INCREMENT,
--     `customer_id` INT(11) NOT NULL,
--     PRIMARY KEY (`order_id`),
--     FOREIGN KEY (`customer_id`) REFERENCES `ims`.`customers`(`customer_id`),
-- );
--
-- CREATE TABLE IF NOT EXISTS `ims`.`order_items` (
--     `order_id` INT(11) NOT NULL,
--     `item_id` INT(11) NOT NULL,
--     `product_quantity` INT(11) NOT NULL
--     PRIMARY KEY (`order_id`, `item_id`),
--     FOREIGN KEY (`order_id`) REFERENCES `ims`.`orders`(`order_id`),
--     FOREIGN KEY (`item_id`) REFERENCES `ims`.`items`(`id`),
--     CONSTRAINT nonzeroOP CHECK (`product_quantity` > 0)
-- );
