<H1>Documentação do Projeto Sistema de Judocas</H1>
<H2>Modelo de Casos de Uso & Especificação dos Casos de Uso</H2>
<H3>Modelo de Casos de Uso</H3>
<img src='./documentos/Diagrama de Casos de Uso.PNG'>
<H3>Especificação dos Casos de Uso</H3>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td>E1 - Adicionar Aluno</td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Registra dados do aluno no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário<br>Secundário: Aluno, Professor</td>
  </tr>
  <tr>
    <th>Prioridade</th>
    <td>Alta</td>
  </tr>
  <tr>
    <th>Risco</th>
    <td>Baixo</td>
  </tr>
  <tr>
    <th>Pre-condições / Suposições</th>
    <td>
      <ol>
        <li>O secretário está com o sistema iniciado na tela principal.</li>
        <li>A taxa de filiação já foi paga;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>O Aluno ou Professor solicita ao secretário filiação de Aluno na Federação;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Aluno ou Professor solicita filiação de um aluno;</li>
        <li>O Secretário seleciona a opção “Cadastrar Aluno” do sistema;</li>
        <li>O Sistema exibe a tela de cadastro de alunos;</li>
        <li>O Aluno ou Professor fornece os dados do aluno a ser cadastrado;</li>
        <li>O Secretário insere os dados do Aluno no sistema;</li>
        <li>O Secretário seleciona a opção “Confirmar Cadastro”;</li>
        <li>O Sistema confirma a filiação do Aluno e fornece o número de filiado;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>6.a Dados inválidos foram fornecidos</u><br>
      6.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrigidos;<br>
      6.a.2 Retorna para o passo 3.<br>
      <u>6.b Dados obrigatórios não foram fornecidos</u><br>
      6.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      6.b.2 Retorna para o passo 3.<br>
    </td>
    </tr>
    <tr>
      <th>Pós-condições</th>
      <td>O Sistema emitir carteira de filiado</td>
    </tr>
    <tr>
      <th>Requisitos não funcionais relacionados</th>
      <td>
        <ul>
          <li>E1-1. Usabilidade</li>
          <li>E1-2. Confiabilidade</li>
        </ul>
      </td>
    </tr>
</table>
