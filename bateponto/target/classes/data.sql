insert into Funcionario(nome_completo, nacionalidade, data_nascimento, tipo_documento, numero_documento, sexo, activo, datainicio, datafim, motivo_cancelamento, salario_hora, bonos_por_entrega, isento_de_ponto, salario_mes, contrato_funcionario_id, tipo_contrato_id)
values('Frederico Jose', 'Angolana', '1992-03-12', 'BI', '00229383838', 'MASCULINO', true, '2019-02-21', '2022-02-21', 'Desvio de verba', 55.00, 100, true, 1000, 1, 1);

insert into Endereco(pais, provincia, bairro, rua, endereco_funcionario_id) values('Angola', 'Luanda', 'Sambizanga', 'Ndunduma', 1);
insert into Contactos(tipo, contacto, funcionario_id) values('Telemovel', '923094312', 1);

insert into parametrizacao_ponto(hora_entrada, hora_saida, qtd_horas_dia) values('08:00:00', '15:30:00', 8);
insert into Ponto(data, hora_entrada, hora_saida, ponto_funcionario_id, ponto_parametrizacao_ponto_id) values('2021-03-18', '08:00:00', '15:30:00', 1, 1);



insert into tipo_contrato(descricao, activo) values('Determinado', true);
insert into funcionario_contrato(datainicio, datafim, activo, motivo_cancelamento, tipo_contrato_id, contrato_funcionario_id) values('2019-02-21', '2022-02-21', true, 'Desvio de verba',1,1);
insert into processamento_salario(data_processamento, mes, exercicio, funcionario_contrato_id) values('2021-03-10',3,2021,1);

insert into funcionario_mensalista(isento_de_ponto, salario_mes, bonos_por_entrega) values(true, 1000, 100);
insert into funcionario_horista(salario_hora) values(55.00);
