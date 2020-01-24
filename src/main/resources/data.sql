INSERT INTO TB_CHARACTER(NAME, DESCRIPTION, THUMBNAIL) 
VALUES 
    ('Hulk', 'Hulk é um selvagem e poderoso alter ego do Dr. Robert Bruce Banner, um cientista que foi atingido por raios gama enquanto salvava um adolescente durante o teste militar de uma bomba por ele desenvolvida. Este adolescente, Rick Jones, tornou-se companheiro de Banner, ajudando-o a manter o Hulk sob controle e mantê-lo longe dos ataques dos militares, que viam a criatura como uma ameaça.', 'images/hulk.jpg'),
	('Teste', 'description', 'images/hulk.jpg');

--

INSERT INTO TB_COMIC (CHARACTER_ID, COMIC) 
VALUES 
	(1, 'Planet Hulk'), 
	(1, 'World War Hulk'), 
	(1, 'Always On My Mind'), 
	(1, 'And Now…The Wolverine!'),
	(2, 'Não');

--
INSERT INTO TB_STORIE (CHARACTER_ID, STORIE) 
VALUES 
	(1, 'Hulk Storie'),
	(1, 'O Retorno do Incrivel Hulk (1988)'),
	(1, 'O Julgamento do Incrivel Hulk (1989)'),
	(1, 'A Morte do Incrivel Hulk (1990)'),
	(1, 'Hulk (2003)'),
	(1, 'O Incrível Hulk (2008)'),
	(2, 'Não');