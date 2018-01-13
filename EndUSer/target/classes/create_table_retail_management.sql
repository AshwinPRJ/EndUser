-- DROP TABLE public.admin_details;

CREATE TABLE admin_details
(
  admin_details_id serial,
  admin_details_userid character varying(20),
  admin_details_password character varying(20),
  admin_details_birth_place character varying(20),
  admin_details_birth_city character varying(20),
  admin_details_dob date,
  admin_details_sta character(1) DEFAULT 'A'::bpchar,
  admin_details_created_by character varying(20),
  admin_details_created_on date,
  admin_details_created_time character varying(10)
);

-- DROP TABLE cust_transactions;

CREATE TABLE cust_transactions
(
  cust_transactions_id serial,
  cust_transactions_cust_id integer,
  cust_transactions_total_amount_purchased numeric(15,2),
  cust_transactions_created_by character varying(20),
  cust_transactions_created_on date,
  cust_transactions_created_time character varying(10)
);

-- DROP TABLE public.customer_details;

CREATE TABLE customer_details
(
  customer_details_id serial,
  customer_details_name character varying(30),
  customer_details_password character varying(20),
  customer_details_shop_name character varying(30),
  customer_details_place character varying(30),
  customer_details_city character varying(30),
  customer_details_wallet_amount numeric(15,2),
  customer_details_fooditems numeric(5,2),
  customer_details_nonfooditems numeric(5,2),
  customer_details_since date,
  customer_details_last_recharge date,
  customer_details_last_debited date,
  customer_details_wallet_amount_left numeric(15,2),
  customer_details_wallet_amount_debited_till_date numeric(15,2),
  customer_details_sta character(1) DEFAULT 'A'::bpchar,
  customer_details_pswd_reset character(1) DEFAULT 'N'::bpchar,
  customer_details_items_percent_change character(1) DEFAULT 'N'::bpchar,
  customer_details_product_change character(1) DEFAULT 'N'::bpchar,
  customer_details_created_by character varying(20),
  customer_details_created_on date,
  customer_details_created_time character varying(10),
  customer_details_updated_by character varying(20),
  customer_details_updated_on date,
  customer_details_updated_time character varying(10),
  CONSTRAINT customer_details_pkey PRIMARY KEY (customer_details_id)
);

CREATE TABLE custproducts
(
  custproducts_productid integer,
  custproducts_custname character varying(50),
  custproducts_sta character(1) DEFAULT 'A'::bpchar,
  custproducts_quantity numeric(6,0) DEFAULT '0'::numeric
);

-- DROP TABLE products;

CREATE TABLE products
(
  products_slno serial,
  products_name character varying(50),
  products_mrp numeric(15,2),
  products_gpprice numeric(15,2),
  products_points numeric(15,0),
  products_sta character(1) DEFAULT 'A'::bpchar
);



-- DROP TABLE retailers_master;

CREATE TABLE retailers_master
(
  retailers_master_id serial,
  retailers_master_name character varying(30),
  retailers_master_password character varying(20),
  retailers_master_description character varying(100),
  retailers_master_sta character(1) DEFAULT 'A'::bpchar,
  retailers_master_created_by character varying(30),
  retailers_master_created_on date,
  retailers_master_created_time character varying(10),
  retailers_master_updated_by character varying(30),
  retailers_master_updated_on date,
  retailers_master_updated_time character varying(10),
  CONSTRAINT retailers_master_pkey PRIMARY KEY (retailers_master_id)
);

-- DROP TABLEshop_purchase_items;

CREATE TABLE shop_purchase_items
(
  shop_purchase_orders_id integer,
  shop_purchase_orders_itemsid integer,
  shop_purchase_orders_itemsquantity integer,
  shop_purchase_orders_shop_itemsprice numeric(15,2),
  shop_purchase_orders_retailer_itemsprice numeric(15,2),
  shop_purchase_orders_quantity_received integer
);

-- DROP TABLE shop_purchase_orders;

CREATE TABLE shop_purchase_orders
(
  shop_purchase_orders_id serial,
  shop_purchase_orders_shoppyid character varying(150),
  shop_purchase_orders_retailerid integer,
  shop_purchase_orders_shop_totalprice numeric(15,2),
  shop_purchase_orders_retailer_totalprice numeric(15,2),
  shop_purchase_orders_expecteddate date,
  shop_purchase_orders_remarks character varying(150),
  shop_purchase_orders_sta character(1) DEFAULT 'E'::bpchar,
  shop_purchase_orders_amt_sta character(1),
  shop_purchase_orders_shop_created_by character varying(30),
  shop_purchase_orders_shop_created_on date,
  shop_purchase_orders_shop_created_time character varying(10),
  shop_purchase_orders_retailer_created_by character varying(30),
  shop_purchase_orders_retailer_created_on date,
  shop_purchase_orders_retailer_created_time character varying(10),
  shop_purchase_orders_updated_by character varying(30),
  shop_purchase_orders_updated_on date,
  shop_purchase_orders_updated_time character varying(10)
);

-- DROP TABLE shoppy_details;

CREATE TABLE shoppy_details
(
  shoppy_details_id serial,
  shoppy_details_name character varying(30),
  shoppy_details_password character varying(20),
  shoppy_details_place character varying(100),
  shoppy_details_sta character(1) DEFAULT 'A'::bpchar,
  shoppy_details_created_by character varying(30),
  shoppy_details_created_on date,
  shoppy_details_created_time character varying(10),
  shoppy_details_updated_by character varying(30),
  shoppy_details_updated_on date,
  shoppy_details_updated_time character varying(10),
  shoppy_details_quantity integer,
  CONSTRAINT shoppy_details_pkey PRIMARY KEY (shoppy_details_id)
);

-- DROP TABLE stock_details;

CREATE TABLE stock_details
(
  stock_details_id integer,
  stock_details_item_id integer,
  stock_details_items character varying(50),
  stock_details_items_sta character(1) DEFAULT 'A'::bpchar,
  stock_details_created_by character varying(30),
  stock_details_created_on date,
  stock_details_created_time character varying(10),
  stock_details_updated_by character varying(50),
  stock_details_updated_on date,
  stock_details_updated_time character varying(10),
  stock_details_quantity integer
);

-- DROP TABLE user_details;

CREATE TABLE user_details
(
  user_details_id serial,
  user_details_grahakid character varying(50),
  user_details_fullname character varying(100),
  user_details_mobile numeric,
  user_details_address character varying(200),
  user_details_city character varying(30),
  user_details_state character varying(30),
  user_details_email character varying(100),
  user_details_is_admin character(1) DEFAULT 'N'::bpchar,
  user_details_last_visit date,
  user_details_last_totamt_purchased numeric(15,2),
  user_details_earned_points integer DEFAULT 0,
  user_details_sta character(1) DEFAULT 'A'::bpchar,
  user_details_created_by character varying(20),
  user_details_created_on date,
  user_details_created_time character varying(10),
  user_details_updated_by character varying(20),
  user_details_updated_on date,
  user_details_updated_time character varying(10)
);

-- DROP TABLE user_points_details;

CREATE TABLE user_points_details
(
  user_points_id serial,
  user_points_grahakid character varying(50),
  user_points_user_points integer,
  user_points_created_by character varying(20),
  user_points_created_on date,
  user_points_created_time character varying(10),
  user_points_update_by character varying(20),
  user_points_updated_on date,
  user_points_update_time character varying(10),
  user_points_userid integer
);

-- DROP TABLE user_transactions;

CREATE TABLE user_transactions
(
  user_transactions_id serial,
  user_transactions_grahakid character varying(50),
  user_transactions_user_number character varying(30),
  user_transactions_food_purchased numeric(15,2),
  user_transactions_nonfood_purchased numeric(15,2),
  user_transactions_total_amount_purchased numeric(15,2),
  user_transactions_earned_points integer,
  user_transactions_created_by character varying(20),
  user_transactions_created_on date,
  user_transactions_created_time character varying(10),
  user_transactions_updated_by character varying(20),
  user_transactions_updated_on date,
  user_transactions_updated_time character varying(10)
);

-- DROP TABLE warehouse_delivery;

CREATE TABLE warehouse_delivery
(
  warehouse_delivery_id integer,
  warehouse_delivery_shop_order_id integer,
  warehouse_delivery_shoppy_id integer,
  warehouse_delivery_retailer_id integer,
  warehouse_delivery_sta character(1) DEFAULT 'P'::bpchar,
  warehouse_delivery_created_by character varying(30),
  warehouse_delivery_created_on date,
  warehouse_delivery_created_time character varying(10),
  warehouse_delivery_updated_by character varying(30),
  warehouse_delivery_updated_on date,
  warehouse_delivery_updated_time character varying(10)
);

-- DROP TABLE warehouse_master;

CREATE TABLE warehouse_master
(
  warehouse_master_id serial,
  warehouse_master_name character varying(30),
  warehouse_master_password character varying(20),
  warehouse_master_description character varying(100),
  warehouse_master_sta character(1) DEFAULT 'A'::bpchar,
  warehouse_master_created_by character varying(30),
  warehouse_master_created_on date,
  warehouse_master_created_time character varying(10),
  warehouse_master_updated_by character varying(30),
  warehouse_master_updated_on date,
  warehouse_master_updated_time character varying(10)
);