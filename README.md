<H1>Documentação do Projeto Sistema de Judocas</H1>
<H2>Modelo de Casos de Uso & Especificação dos Casos de Uso</H2>
<H3>Modelo de Casos de Uso</H3>
<img src='./documentos/Diagrama de Casos de Uso.PNG'>
<H3>Especificação dos Casos de Uso</H3>
<br>
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
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E2 - Buscar Aluno</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Pesquisa por alunos cadastrados no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário</td>
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
        <li>Já existem alunos cadastrados no sistema;</li>
        <li>O secretário já sabe qual aluno vai buscar e algumas dados sobre ele;</li>
        <li>O secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>O Secretário necessecita dos dados de um aluno; Atualização de aluno;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Pesquisar Aluno” no sistema;</li>
        <li>O Sistema exibe a tela de busca de alunos;</li>
        <li>O Secretário fornece ao sistema os dados que ele já sabe sobre o aluno;</li>
        <li>O Secretário seleciona a opção “Buscar”;</li>
        <li>De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis alunos que o Secretário estava procurando.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>4.a O Sistema não encontrou nenhum Aluno com os dados informados</u><br>
      4.a.1 O Sistema informa que nenhum aluno foi encontrado com os dados fornecidos;<br>
      4.a.2 Retorna para o passo 2.<br>
    </td>
    </tr>
    <tr>
      <th>Pós-condições</th>
      <td></td>
    </tr>
    <tr>
      <th>Requisitos não funcionais relacionados</th>
      <td>
        <ul>
          <li>E1-1. Performance</li>
        </ul>
      </td>
    </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E3 - Atualizar Aluno</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Atualiza os dados pessoais de um aluno previamente cadastrado no sistema.</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário<br>Secundário:Aluno, Professor</td>
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
        <li>O Secretário sabe o número de registro do Aluno na Federação, ou sabe outras informações para que possa localizá-lo no sistema;</li>
        <li>O secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>Mudanças nos dados pessoais do Aluno são notificados ao Secretário por Professor ou Aluno.</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Atualizar Aluno” no sistema;</li>
        <li>O Sistema exibe a tela de atualização de alunos;</li>
        <li>O Secretário fornece ao sistema o número de registro do Aluno a ser atualizado;</li>
        <li>O Sistema exibe os dados do Aluno a ser atualizado;</li>
        <li>O Secretário fornece os novos dados do Aluno;</li>
        <li>O Secretário seleciona a opção “Atualizar Dados”</li>
        <li>O Sistema confirma a atualização dos dados do Aluno;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>3.a. O Secretário não sabe o número de registro do Aluno</u><br>
      3.a.1 O Secretário seleciona a opção “Procurar Aluno”<br>
      3.a.2 O Sistema mostra a tela de busca de alunos;<br>
      3.a.3 O Secretário fornece ao sistema os dados que ele já sabe sobre o aluno;<br>
      3.a.4 O Secretário seleciona a opção “Buscar”;<br>
      3.a.5 De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis alunos que o Secretário estava procurando.<br>
      3.a.6 O Secretário seleciona o Aluno que está procurando<br>
      <u>6.a Dados inválidos foram fornecidos</u><br>
      6.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrijidos;<br>
      6.a.2 Retorna para o passo 3.<br>
      <u>6.b Dados obrigatórios não foram fornecidos</u><br>
      6.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      6.b.2 Retorna para o passo 3.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Usabilidade<br>E1-2. Confiabilidade</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E4 - Adicionar Professor</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Registra um professor no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário<br>Secundário: Professor</td>
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
        <li>O Professor foi autorizado pela Federação para ministar aulas de judô;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>O Professor solicita ao secretário sua filiação;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Professor solicita seu cadastro;</li>
        <li>O Secretário seleciona a opção “Cadastrar Professor” no sistema;</li>
        <li>O Sistema exibe a tela de cadastro de professores;</li>
        <li>Se o Professor já tem registro no Sistema como Aluno
          <ol>
            <li>O Secretário seleciona a opção “Buscar Filiado”;</li>
            <li>O Sistema mostra a tela de busca de filiados;</li>
            <li>O Secretário informa os dados que sabe sobre o Professor;</li>
            <li>O Secretário seleciona a opção “Buscar”</li>
            <li>O Sistema mostra uma lista de possíveis Professores;</li>
            <li>O Secretário seleciona o professor que está procurando;</li>
          </ol>
        </li>
        <li>Senão
          <ol>
            <li>O Secretário insere os dados do Professor ao Sistema;</li>
          </ol>
        </li>
        <li>O Secretário insere as Entidades em que o professor ministra aulas;</li>
        <li>O Secretário seleciona a opção “Confirmar Cadastro”;</li>
        <li>O Sistema confirma o cadastro do Professor e informa o número de filiado do mesmo;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>4.4.a O Sistema não encontra nenhum Professor</u><br>
      3.a.1 O Secretário seleciona a opção “Procurar Aluno”<br>
      4.4.a.1 O Sistema informa que não encontrou nenhum resultado para aquela busca;<br>
      4.4.a.1 Retorna para o passo 4.2<br>
      <u>7.a Dados inválidos foram fornecidos</u><br>
      7.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrijidos;<br>
      7.a.2 Retorna para o passo 3.<br>
      <u>7.b Dados obrigatórios não foram fornecidos</u><br>
      7.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      7.b.2 Retorna para o passo 3.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Usabilidade<br>E1-2. Confiabilidade</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E5 - Buscar Professor</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Pesquisa por professores cadastrados no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário</td>
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
        <li>Já existem professores cadastrados no sistema;</li>
        <li>O secretário já sabe qual professor vai buscar e algumas dados sobre ele;</li>
        <li>O secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>O Secretário necessecita dos dados de um professor; Atualização de professor;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Pesquisar Professor” no sistema;</li>
        <li>O Sistema exibe a tela de busca de professores;</li>
        <li>O Secretário fornece ao sistema os dados que ele já sabe sobre o professor;</li>
        <li>O Secretário seleciona a opção “Buscar”;</li>
        <li>De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis professores que o Secretário estava procurando.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>4.a O Sistema não encontrou nenhum Professor com os dados informados</u><br>
      4.a.1 O Sistema informa que nenhum professor foi encontrado com os dados fornecidos;<br>
      4.a.2 Retorna para o passo 2.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Performance</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E6 – Atualizar Professor</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Atualiza os dados pessoais de um professor previamente cadastrado no sistema.</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário<br>Secundário: Professor</td>
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
        <li>O Secretário sabe o número de registro do Professor, ou sabe outras informações para que possa localizá-lo no sistema;</li>
        <li>O Secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>Mudanças nos dados pessoais do Professor são notificados ao Secretário pelo mesmo.</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Atualizar Professor” no sistema;</li>
        <li>O Sistema exibe a tela de atualização de professores;</li>
        <li>O Secretário fornece ao sistema o número de registro do Professor a ser atualizado;</li>
        <li>O Sistema exibe os dados do Professor a ser atualizado;</li>
        <li>O Secretário fornece os novos dados do Professor;</li>
        <li>O Secretário seleciona a opção “Atualizar Dados”</li>
        <li>O Sistema confirma a atualização dos dados do Professor;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>3.a. O Secretário não sabe o número de registro do Professor</u><br>
      3.a.1 O Secretário seleciona a opção “Procurar Professor”<br>
      3.a.2 O Sistema mostra a tela de busca de professores;<br>
      3.a.3 O Secretário fornece ao sistema os dados que ele já sabe sobre o professor;<br>
      3.a.4 O Secretário seleciona a opção “Buscar”;<br>
      3.a.5 De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis professores que o Secretário estava procurando;<br>
      3.a.6 O Secretário seleciona o Professor que está procurando.<br>
      <u>6.a Dados inválidos foram fornecidos</u><br>
      6.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrijidos;<br>
      6.a.2 Retorna para o passo 3.<br>
      <u>6.b Dados obrigatórios não foram fornecidos</u><br>
      6.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      6.b.2 Retorna para o passo 3.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Usabilidade<br>E1-2. Confiabilidade</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E7 - Adicionar Entidade</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Registra uma Entidade no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário</td>
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
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>Uma nova entidade oferecer prática de Judô;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Professor informa que ministra aulas em uma entidade que ainda não está cadastrada no sistema e fornece-lhe os dados sobre a Entidade;</li>
        <li>O Secretário seleciona a opção “Cadastrar Entidade” no sistema;</li>
        <li>O Sistema exibe a tela de cadastro de entidades;</li>
        <li>O Secretário insere os dados da Entidade no Sistema;</li>
        <li>O Secretário seleciona a opção “Confirmar Cadastro”;</li>
        <li>O Sistema confirma o cadastro da Entidade.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>5.a Dados inválidos foram fornecidos</u><br>
      5.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrijidos;<br>
      5.a.2 Retorna para o passo 3.<br>
      <u>5.b Dados obrigatórios não foram fornecidos</u><br>
      5.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      5.b.2 Retorna para o passo 3.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Usabilidade<br>E1-2. Confiabilidade</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E8 - Buscar Entidade</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Pesquisa por entidades cadastradas no sistema</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário</td>
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
        <li>Já existem entidades cadastradas no sistema;</li>
        <li>O secretário já sabe qual entidade vai buscar e algumas dados sobre ela;</li>
        <li>O secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>O Secretário necessecita dos dados de um entidade; Atualização de entidade;</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Pesquisar Entidades” no sistema;</li>
        <li>O Sistema exibe a tela de busca de entidades;</li>
        <li>O Secretário fornece ao sistema os dados que ele já sabe sobre a entidade;</li>
        <li>O Secretário seleciona a opção “Buscar”;</li>
        <li>De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis entidadees que o Secretário estava procurando.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>4.a O Sistema não encontrou nenhuma Entidade com os dados informados</u><br>
      4.a.1 O Sistema informa que nenhuma Entidade foi encontrada com os dados fornecidos;<br>
      4.a.2 Retorna para o passo 2.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Performance</li>
      </ul>
    </td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th>Casos de Uso</th>
    <td><strong>E9 – Atualizar Entidade</strong></td>
  </tr>
  <tr>
    <th>Descrição</th>
    <td>Atualiza os dados de uma Entidade previamente cadastrada no sistema.</td>
  </tr>
  <tr>
    <th>Ator(es)</th>
    <td>Primário: Secretário</td>
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
        <li>O Secretário está com o sistema iniciado na tela principal.</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Trigger</th>
    <td>Mudanças nos dados da Entidade são notificados ao Secretário.</td>
  </tr>
  <tr>
    <th>Fluxo de Eventos</th>
    <td>
      <ol>
        <li>O Secretário seleciona a opção “Atualizar Entidade” no sistema;</li>
        <li>O Sistema exibe a tela de atualização de entidades;</li>
        <li>O Secretário fornece ao sistema o número de registro da Entidade a ser atualizada;</li>
        <li>O Sistema exibe os dados da Entidade a ser atualizada;</li>
        <li>O Secretário fornece os novos dados da Entidade;</li>
        <li>O Secretário seleciona a opção “Atualizar Dados”</li>
        <li>O Sistema confirma a atualização dos dados da Entidade;</li>
      </ol>
    </td>
  </tr>
  <tr>
    <th>Fluxo Alternativo</th>
    <td>
      <u>3.a. O Secretário não sabe o número de registro da Entidade</u><br>
      3.a.1 O Secretário seleciona a opção “Procurar Entidade”<br>
      3.a.2 O Sistema mostra a tela de busca de entidades;<br>
      3.a.3 O Secretário fornece ao sistema os dados que ele já sabe sobre a entidade;<br>
      3.a.4 O Secretário seleciona a opção “Buscar”;<br>
      3.a.5 De acordo com os dados fornecidos pelo Secretário, o sistema retorna uma lista de possíveis entidades que o Secretário estava procurando;<br>
      3.a.6 O Secretário seleciona a Entidade que está procurando.<br>
      <u>6.a Dados inválidos foram fornecidos</u><br>
      6.a.1 O Sistema informa que dados inválidos foram fornecidos e solicita que os mesmos sejam corrijidos;<br>
      6.a.2 Retorna para o passo 3.<br>
      <u>6.b Dados obrigatórios não foram fornecidos</u><br>
      6.b.1 O Sistema informa que dados obrigatórios não foram fornecidos e solicita que os mesmos sejam fornecidos;<br>
      6.b.2 Retorna para o passo 3.<br>
    </td>
  </tr>
  <tr>
    <th>Pós-condições</th>
    <td></td>
  </tr>
  <tr>
    <th>Requisitos não funcionais relacionados</th>
    <td>
      <ul>
        <li>E1-1. Usabilidade<br>E1-2. Integridade de Dados</li>
      </ul>
    </td>
  </tr>
</table>
<H2>Diagrama de Domínio</H2>
<img src='./documentos/DiagramasJude/Diagrama de Dominio.png'>
