create database vista_restaurante;

use vista_restaurante;

CREATE TABLE menu (
  id_prato int(11) NOT NULL,
  nome_prato varchar(185) NOT NULL,
  desc_prato varchar(255) NOT NULL,
  preco decimal(12,2) NOT NULL,
  tipo varchar(10) NOT NULL,
  primary key(id_prato)
)

CREATE TABLE pedido (
  id_pedido int(11) NOT NULL,
  mesa int(2) NOT NULL,
  numeros_pedidos varchar(100) NOT NULL,
  observacao varchar(200) DEFAULT NULL,
  data_hora datetime NOT NULL,
  garcom varchar(30) NOT NULL,
  status varchar(10) NOT NULL,
  preco_prat varchar(55) DEFAULT NULL,
  primary key(id_pedido)
);

INSERT INTO menu (id_prato, nome_prato, desc_prato, preco, tipo) VALUES
(1, "Feijoada", "Feijao preto cozido com carnes variadas e arroz", 75.00, "Principal"),
(2, "Lasanha", "Massa em camadas com carne, queijo e molho de tomate", 60.00, "Principal"),
(3, "Picanha", "Picanha grelhada servida com arroz, farofa e vinagrete", 85.00, "Principal"),
(4, "Moqueca de Camarao", "Camaroes cozidos em molho de dende, leite de coco e temperos", 95.00, "Principal"),
(5, "Risoto de Cogumelos", "Arroz cremoso com cogumelos frescos e parmesao", 70.00, "Principal"),
(6, "File de Peixe", "File de peixe grelhado com pure de batata e legumes", 65.00, "Principal"),
(7, "Salada Caesar", "Salada com alface romana, croutons e molho especial Caesar", 45.00, "Entrada"),
(8, "Coca-Cola", "Refrigerante classico, 350ml", 6.50, "Bebida"),
(9, "Suco de Laranja", "Suco natural de laranja, 300ml", 8.00, "Bebida"),
(10, "Agua Mineral", "Agua mineral sem gas, 500ml", 4.00, "Bebida"),
(11, "Cha Gelado", "Cha gelado de limao, 300ml", 7.00, "Bebida"),
(12, "Cerveja", "Cerveja pilsen, 600ml", 12.00, "Bebida"),
(13, "Vinho Tinto", "Taca de vinho tinto seco", 20.00, "Bebida");


