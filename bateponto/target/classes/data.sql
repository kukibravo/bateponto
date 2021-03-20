insert into Funcionario(NOMECOMPLETO, nacionalidade, DATANASCIMENTO, TIPODOCUMENTO, numeroDocumento, sexo)
values('Frederico Jose', 'Angolana', '1992-03-12', 'BI', '00229383838', 'MASCULINO');

insert into Endereco(pais, provincia, bairro, rua, enderecofuncionario_funcionario_id) values('Angola', 'Luanda', 'Sambizanga', 'Ndunduma', 1);
insert into Contactos(tipo, contacto, funcionario_id) values('Telemovel', '923094312', 1);

insert into parametrizacao_ponto(horaentrada, horasaida, qtdhorasdia) values('08:00:00', '15:30:00', 8);
insert into Ponto(data, horaentrada, horasaida, ponto_funcionario_id, ponto_parametrizacaoponto_id) values('2021-03-18', '08:00:00', '15:30:00', 1, 1);



insert into tipo_contrato(descricao, activo) values('Determinado', true);
insert into funcionario_contrato(datainicio, datafim, activo, motivocancelamento, tipo_contrato_id, funcionariocontrato_funcionario_id) values('2019-02-21', '2022-02-21', true, 'Desvio de verba',1,1);
insert into processamento_salario(dataprocessamento, mes, exercicio, funcionariocontrato_id) values('2021-03-10',3,2021,1);

insert into funcionario_mensalista (isentodeponto, salariomes, bonosporentrega) values(true, 1000, 100);
insert into funcionario_horista(salariohora) values(55.00);
