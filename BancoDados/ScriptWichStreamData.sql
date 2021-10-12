CREATE TABLE usuario (user_id INT PRIMARY KEY, user_name VARCHAR(50) NOT NULL, 
	   user_lastname VARCHAR(50) NOT NULL, user_email VARCHAR(50) NOT NULL, 
	   user_password VARCHAR(50) NOT NULL );
	  
CREATE TABLE conteudo (cont_id INT PRIMARY KEY, cont_titulo VARCHAR(100) NOT NULL, 
	   cont_desc VARCHAR(1000) NOT NULL, cont_duracao VARCHAR(1000) NOT NULL, 
	   cont_dataLancamento DATE NOT NULL, cont_genero VARCHAR(100) NOT NULL, 
	   cont_imagem VARCHAR(100) NOT NULL, cont_like INT NOT NULL );
	   
CREATE TABLE usuario_rede (user_net_id INT PRIMARY KEY, user_net_name VARCHAR(100) NOT NULL, 
	   user_net_foto VARCHAR(1000) NOT NULL, user_net_auth VARCHAR(100) NOT NULL );
	   
CREATE TABLE filme (filme_id INT PRIMARY KEY, sequencia VARCHAR(100) NOT NULL );
	   
CREATE TABLE serie (serie_id INT PRIMARY KEY, temporada VARCHAR(100) NOT NULL, 
	   episodio VARCHAR(1000) );
	   
CREATE TABLE comentario (coment_id INT PRIMARY KEY, coment_titulo VARCHAR(100) NOT NULL, 
	   coment_desc VARCHAR(1000), coment_criacao DATE NOT NULL);