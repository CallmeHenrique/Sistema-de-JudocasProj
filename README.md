<H1>Documentação do Projeto Sistema de Judocas</H1>
<H2>Membros do Projeto</H2>
Gabriel Lopez Vendramini - RA: 22.121.015-6<br>
Henrique Costa - RA: 22.121.028-9<br>
Juan Lira Estevão - RA: 22.121.033-9<br>
Pedro Henrique B. L. Barbieri - RA: 22.121.037-0<br>
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
<H2>Especificação dos Testes de Casos de Uso</H2>
<H3>Teste de Casos de Uso: E1 - Adicionar Aluno</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.a</td>
  </tr>
  <tr>
    <th>Cenário 3</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.b</td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
    <th>Cenário 3</th>
  </tr>
  <tr>
    <th>Dados são válidos?</th>
    <td>Sim</td>
    <td>Não</td>
    <td></td>
  </tr>
  <tr>
    <th>Dados obrigatórios preenchidos?</th>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>Nome do Aluno: Teste Aluno<br>CPF: 123.123.123-12<br>CBJ: 11111111<br>email: teste@teste.com.br<br>RG: 12.123.123-1<br>Data de Nascimento: 09/12/2002<br>Órgão: SSP<br>
    Fone 1: (11) 91231-1231<br>Fone 2: (15) 91231-1231
    </td>
    <td>Aluno ainda não cadastrado</td>
    <td>Aluno Cadastrado com Sucesso!</td>
    <td>Aluno Cadastrado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>Nome do Aluno: Teste Aluno 2<br>CPF: ABC.123.123-12</td>
    <td>Aluno ainda não cadastrado</td>
    <td>Aluno com dados inválidos!</td>
    <td>Aluno Cadastrado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 3</td>
    <td>Todos os campos em branco</td>
    <td>Aluno ainda não cadastrado</td>
    <td>Aluno com Dados Obrigatórios não preenchidos!</td>
    <td>Aluno Cadastrado com Sucesso!</td>
  </tr>
</table>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E1_Caso_1.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E1_Caso_2.png'>
<strong>Caso 3</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E1_Caso_3.png'>

<H3>Teste de Casos de Uso: E2 - Buscar Aluno</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 4.a</td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
  </tr>
  <tr>
    <th>Sistema Encontrou o Aluno?</th>
    <td>Sim</td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>ID: 313</td>
    <td>Aluno com ID "313" criado</td>
    <td>Encontrado</td>
    <td>Encontrado</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>ID: 1234123123</td>
    <td>Aluno com ID "313" criado</td>
    <td>Não Encontrado</td>
    <td>Não Encontrado</td>
  </tr>
</table><br>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E2_Caso_1.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E2_Caso_2.png'>

<H3>Teste de Casos de Uso: E3 - Atualizar Aluno</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 3</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 4</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.b</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 5</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td>Fluxo Alternativo 6.a</td>
  </tr>
  <tr>
    <th>Cenário 6</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td>Fluxo Alternativo 6.b</td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
    <th>Cenário 3</th>
    <th>Cenário 4</th>
    <th>Cenário 5</th>
    <th>Cenário 6</th>
  </tr>
  <tr>
    <th>Secratário sabe o número de registro do Aluno?</th>
    <td>Sim</td>
    <td>Não</td>
    <td>Sim</td>
    <td>Sim</td>
    <td>Não</td>
    <td>Não</td>
  </tr>
  <tr>
    <th>Dados válidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
    <td></td>
  </tr>
  <tr>
    <th>Dados obrigatórios preenchidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>ID do Aluno é 313, remover o E-mail</td>
    <td>Aluno com ID 313 cadastrado</td>
    <td>Aluno Atualizado com Sucesso!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>ID do Aluno é desconhecido, remover o E-mail e Fone 2</td>
    <td>Aluno com ID desconhecido cadastrado</td>
    <td>Aluno Atualizado com Sucesso!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 3</td>
    <td>ID do Aluno é 313, alterar CPF para AAAAA.456.789-10</td>
    <td>Aluno com ID 313 cadastrado</td>
    <td>Aluno com Dados Inválidos!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 4</td>
    <td>ID do Aluno é 313, remover todas as informações</td>
    <td>Aluno com ID 313 cadastrado</td>
    <td>Aluno com Dados Obrigatórios não preenchidos!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 5</td>
    <td>ID do Aluno é desconhecido, alterar CPF para AAAAA.456.789-10</td>
    <td>Aluno com ID desconhecido cadastrado</td>
    <td>Aluno com Dados Inválidos!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 6</td>
    <td>ID do Aluno é desconhecido, remover todas as informações</td>
    <td>Aluno com ID desconhecido cadastrado</td>
    <td>Aluno com Dados Obrigatórios não preenchidos!</td>
    <td>Aluno Atualizado com Sucesso!</td>
  </tr>
</table>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_1a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_1b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_1c.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_2a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_2b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_2c.png'>
<strong>Caso 3</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_3a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_3b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_3c.png'>
<strong>Caso 4</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_4a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_4b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_4c.png'>
<strong>Caso 5</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_5a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_5b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_5c.png'>
<strong>Caso 6</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_6a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_6b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E3_Caso_6c.png'>

<H3>Teste de Casos de Uso: E4 - Adicionar Professor</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 4.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 3</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 7.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 4</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 7.b</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 5</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 4.a</td>
    <td>Fluxo Alternativo 7.a</td>
  </tr>
  <tr>
    <th>Cenário 6</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 4.a</td>
    <td>Fluxo Alternativo 7.b</td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
    <th>Cenário 3</th>
    <th>Cenário 4</th>
    <th>Cenário 5</th>
    <th>Cenário 6</th>
  </tr>
  <tr>
    <th>Professor já tem registro?</th>
    <td>Sim</td>
    <td>Não</td>
    <td>Sim</td>
    <td>Sim</td>
    <td>Não</td>
    <td>Não</td>
  </tr>
  <tr>
    <th>Dados válidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
    <td></td>
  </tr>
  <tr>
    <th>Dados obrigatórios preenchidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>Registro do Professor é 320, Professor ainda não criado</td>
    <td>Registro do Professor com ID 320</td>
    <td>Professor Criado com Sucesso!</td>
    <td>Não foi possível selecionar o Professor 320 na tela de Busca</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>Não possui registro, Professor ainda não criado</td>
    <td>Professor ainda não cadastrado</td>
    <td>Professor Criado com Sucesso!</td>
    <td>Professor Criado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 3</td>
    <td>Registro do Professor é 320, Professor ainda não criado</td>
    <td>Registro do Professor com ID 320</td>
    <td>Professor Criado com Sucesso!</td>
    <td>Não foi possível selecionar o Professor 320 na tela de Busca</td>
  </tr>
  <tr>
    <td>Caso 4</td>
    <td>Registro do Professor é 320, Professor ainda não criado</td>
    <td>Registro do Professor com ID 320</td>
    <td>Professor Criado com Sucesso!</td>
    <td>Não foi possível selecionar o Professor 320 na tela de Busca</td>
  </tr>
  <tr>
    <td>Caso 5</td>
    <td>Não possui registro, Informações inválidas</td>
    <td>Professor ainda não cadastrado</td>
    <td>Existem dados inválidos!</td>
    <td>Professor Criado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 6</td>
    <td>Não possui registro, Informações obrigatórias em branco</td>
    <td>Professor ainda não cadastrado</td>
    <td>Existem dados obrigatórios em branco!</td>
    <td>Professor Criado com Sucesso!</td>
  </tr>
</table>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_1a_3a_4a.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_2a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_2b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_2c.png'>
<strong>Caso 3</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_1a_3a_4a.png'>
<strong>Caso 4</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_1a_3a_4a.png'>
<strong>Caso 5</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_5a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_5b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_5c.png'>
<strong>Caso 6</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_6a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_6b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E4_Caso_6c.png'>

<H3>Teste de Casos de Uso: E5 - Buscar Professor</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 4.a</td>
    <td></td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
  </tr>
  <tr>
    <th>Secratário encontrou Registro do Professor?</th>
    <td>Sim</td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>Nome do Professor é Professor A</td>
    <td>Professor com Nome do Professor A estar cadastrado</td>
    <td>Professor Encontrado!</td>
    <td>Professor Encontrado!</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>ID do Professor é 320</td>
    <td>Professor com ID 320 estar cadastrado</td>
    <td>Professor Encontrado!</td>
    <td>Professor Não Encontrado!</td>
  </tr>
  <tr>
    <td>Caso 3</td>
    <td>ID do Professor é 123123</td>
    <td>Professor com Nome do Professor A estar cadastrado</td>
    <td>Professor Não Encontrado!</td>
    <td>Professor Não Encontrado!</td>
  </tr>
</table>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E5_Caso_1.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E5_Caso_2.png'>
<strong>Caso 3</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E5_Caso_3.png'>

<H3>Teste de Casos de Uso: E6 - Atualizar Professor</H3>
<strong>Tabela de Cenários</strong>
<table>
  <tr>
    <th>Cenário 1</th>
    <td>Fluxo Principal</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 2</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 3</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.a</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 4</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 6.b</td>
    <td></td>
  </tr>
  <tr>
    <th>Cenário 5</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td>Fluxo Alternativo 6.a</td>
  </tr>
  <tr>
    <th>Cenário 6</th>
    <td>Fluxo Principal</td>
    <td>Fluxo Alternativo 3.a</td>
    <td>Fluxo Alternativo 6.b</td>
  </tr>
</table>
<br>
<strong>Tabela de Decisão</strong>
<table>
  <tr>
    <th>ID Cenário</th>
    <th>Cenário 1</th>
    <th>Cenário 2</th>
    <th>Cenário 3</th>
    <th>Cenário 4</th>
    <th>Cenário 5</th>
    <th>Cenário 6</th>
  </tr>
  <tr>
    <th>Secratário sabe o número de registro do Aluno?</th>
    <td>Sim</td>
    <td>Não</td>
    <td>Sim</td>
    <td>Sim</td>
    <td>Não</td>
    <td>Não</td>
  </tr>
  <tr>
    <th>Dados válidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
    <td></td>
  </tr>
  <tr>
    <th>Dados obrigatórios preenchidos?</th>
    <td>Sim</td>
    <td>Sim</td>
    <td></td>
    <td>Sim</td>
    <td></td>
    <td>Não</td>
  </tr>
</table>
<strong>Casos de Teste</strong>
<table>
  <tr>
    <th>Caso de Teste</th>
    <th>Condição de Entrada</th>
    <th>Cenário</th>
    <th>Resultado Esperado</th>
    <th>Resultado Obtido</th>
  </tr>
  <tr>
    <td>Caso 1</td>
    <td>Nome do Professor é Professor A, atualizar E-mail, Registro CBJ, CPF e Data de Nascimento</td>
    <td>Professor com Nome Professor A estar cadastrado</td>
    <td>Professor Atualizado com Sucesso!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 2</td>
    <td>Nome do Professor é desconhecido, atualizar E-mail, Registro CBJ, RG, CPF e Data de Nascimento</td>
    <td>Professor com informações desconhecidas estar cadastrado</td>
    <td>Professor Atualizado com Sucesso!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 3</td>
    <td>Nome do Professor é Professor A, alterar CPF para AAA.456.789-10</td>
    <td>Professor com Nome Professor A estar cadastrado</td>
    <td>Professor com Dados Inválidos!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 4</td>
    <td>Nome do Professor é Professor A, remover todas as informações</td>
    <td>Professor com Nome Professor A estar cadastrado</td>
    <td>Professor com Dados Obrigatórios não preenchidos!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 5</td>
    <td>Nome do Professor é Professor A, alterar CPF para AAA.456.789-10</td>
    <td>Professor com informações desconhecidas estar cadastrado</td>
    <td>Professor com Dados Inválidos!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
  <tr>
    <td>Caso 6</td>
    <td>Nome do Professor é Professor A, remover todas as informações</td>
    <td>Professor com informações desconhecidas estar cadastrado</td>
    <td>Professor com Dados Obrigatórios não preenchidos!</td>
    <td>Professor Atualizado com Sucesso!</td>
  </tr>
</table>
<strong>Evidências de Testes</strong><br>
<strong>Caso 1</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_1a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_1b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_1c.png'>
<strong>Caso 2</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_2a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_2b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_2c.png'>
<strong>Caso 3</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_3a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_3b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_3c.png'>
<strong>Caso 4</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_4a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_4b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_4c.png'>
<strong>Caso 5</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_5a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_5b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_5c.png'>
<strong>Caso 6</strong><br>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_6a.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_6b.png'>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Juan/documentos/Evidencias%20Testes%20de%20Casos%20de%20Uso/E6_Caso_6c.png'>

<H2>Especificação dos Testes Unitários</H2>
<H3>1. Classe Aluno</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Filiado</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>12</td>
    <td>9</td>
  </tr>
  <tr>
    <td>2</td>
    <td>12</td>
    <td>27</td>
  </tr>
  <tr>
    <td>3</td>
    <td>12</td>
    <td>34</td>
  </tr>
  <tr>
    <td>4</td>
    <td>12</td>
    <td>35</td>
  </tr>
  <tr>
    <td>5</td>
    <td>12</td>
    <td>43</td>
  </tr>
  <tr>
    <td>6</td>
    <td>12</td>
    <td>47</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Entidade</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>18</td>
    <td>15</td>
  </tr>
  <tr>
    <td>2</td>
    <td>48</td>
    <td>15</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Professor</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>24</td>
    <td>21</td>
  </tr>
  <tr>
    <td>2</td>
    <td>49</td>
    <td>21</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Hash</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>42</td>
    <td>43</td>
  </tr>
</table>
<br>
<strong>Teste de Grafo de Fluxo de Controle</strong><br>
5. Método: equals(Object obj)
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Testes%20de%20Grafo%20de%20Fluxo%20de%20Controle/Classe%20Aluno%20Metodo%20Equals.png'>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Aluno.png'>
<H3>2. Classe Endereço</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Rua</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>27</td>
    <td>24</td>
  </tr>
  <tr>
    <td>2</td>
    <td>27</td>
    <td>15</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Numero</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>33</td>
    <td>30</td>
  </tr>
  <tr>
    <td>2</td>
    <td>33</td>
    <td>16</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Bairro</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>39</td>
    <td>36</td>
  </tr>
  <tr>
    <td>2</td>
    <td>39</td>
    <td>17</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Cidade</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>45</td>
    <td>42</td>
  </tr>
  <tr>
    <td>2</td>
    <td>45</td>
    <td>18</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">5. Variável Estado</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>51</td>
    <td>48</td>
  </tr>
  <tr>
    <td>2</td>
    <td>51</td>
    <td>19</td>
  </tr>
</table>
<br>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Endereco.png'>
<H3>3. Classe Entidade</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Nome</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>30</td>
    <td>15</td>
  </tr>
  <tr>
    <td>2</td>
    <td>30</td>
    <td>23</td>
  </tr>
  <tr>
    <td>3</td>
    <td>30</td>
    <td>27</td>
  </tr>
  <tr>
    <td>4</td>
    <td>30</td>
    <td>59</td>
  </tr>
    <tr>
    <td>5</td>
    <td>63</td>
    <td>15</td>
  </tr>
  <tr>
    <td>6</td>
    <td>63</td>
    <td>23</td>
  </tr>
  <tr>
    <td>7</td>
    <td>63</td>
    <td>27</td>
  </tr>
  <tr>
    <td>8</td>
    <td>63</td>
    <td>59</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Telefone1</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>36</td>
    <td>33</td>
  </tr>
  <tr>
    <td>2</td>
    <td>65</td>
    <td>33</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Telefone2</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>42</td>
    <td>39</td>
  </tr>
  <tr>
    <td>2</td>
    <td>66</td>
    <td>39</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável CNPJ</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>54</td>
    <td>51</td>
  </tr>
  <tr>
    <td>2</td>
    <td>64</td>
    <td>51</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">5. Variável Estado</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>51</td>
    <td>48</td>
  </tr>
  <tr>
    <td>2</td>
    <td>51</td>
    <td>19</td>
  </tr>
</table>
<br>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Entidade.png'>
<H3>4. Classe Faixa</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Cor</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>17</td>
    <td>22</td>
  </tr>
  <tr>
    <td>2</td>
    <td>17</td>
    <td>36</td>
  </tr>
  <tr>
    <td>3</td>
    <td>26</td>
    <td>22</td>
  </tr>
  <tr>
    <td>4</td>
    <td>26</td>
    <td>36</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável dataEntrega</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>18</td>
    <td>29</td>
  </tr>
  <tr>
    <td>2</td>
    <td>18</td>
    <td>36</td>
  </tr>
  <tr>
    <td>3</td>
    <td>32</td>
    <td>29</td>
  </tr>
  <tr>
    <td>4</td>
    <td>32</td>
    <td>36</td>
  </tr>
</table>
<br>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Faixa.png'>
<H3>5. Classe Filiado</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável registroCbj</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>62</td>
    <td>59</td>
  </tr>
  <tr>
    <td>2</td>
    <td>62</td>
    <td>24</td>
  </tr>
  <tr>
    <td>3</td>
    <td>130</td>
    <td>59</td>
  </tr>
  <tr>
    <td>4</td>
    <td>130</td>
    <td>24</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Email</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>98</td>
    <td>95</td>
  </tr>
  <tr>
    <td>2</td>
    <td>98</td>
    <td>26</td>
  </tr>
  <tr>
    <td>3</td>
    <td>136</td>
    <td>95</td>
  </tr>
  <tr>
    <td>4</td>
    <td>136</td>
    <td>26</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável dataCadastro</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>74</td>
    <td>71</td>
  </tr>
  <tr>
    <td>2</td>
    <td>132</td>
    <td>71</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Endereco</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>80</td>
    <td>77</td>
  </tr>
  <tr>
    <td>2</td>
    <td>133</td>
    <td>77</td>
  </tr>
</table>
<br>
<strong>Teste de Grafo de Fluxo de Controle</strong><br>
5. Método: equals(Object obj)
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Testes%20de%20Grafo%20de%20Fluxo%20de%20Controle/Classe%20Aluno%20Metodo%20Equals.png'>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Filiado.png'>
<H3>6. Classe Professor</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Filiado</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>31</td>
    <td>27</td>
  </tr>
  <tr>
    <td>2</td>
    <td>31</td>
    <td>43</td>
  </tr>
  <tr>
    <td>3</td>
    <td>31</td>
    <td>23</td>
  </tr>
  <tr>
    <td>4</td>
    <td>31</td>
    <td>15</td>
  </tr>
  <tr>
    <td>5</td>
    <td>7</td>
    <td>27</td>
  </tr>
  <tr>
    <td>6</td>
    <td>7</td>
    <td>43</td>
  </tr>
  <tr>
    <td>7</td>
    <td>7</td>
    <td>23</td>
  </tr>
  <tr>
    <td>8</td>
    <td>7</td>
    <td>15</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Entidade</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>39</td>
    <td>35</td>
  </tr>
  <tr>
    <td>2</td>
    <td>8</td>
    <td>35</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Hash</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>22</td>
    <td>23</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Other</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>14</td>
    <td>15</td>
  </tr>
</table>
<br>
<strong>Teste de Grafo de Fluxo de Controle</strong><br>
5. Método: equals(Object obj)
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Testes%20de%20Grafo%20de%20Fluxo%20de%20Controle/Classe%20Aluno%20Metodo%20Equals.png'>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20Professor.png'>
<H3>7. Classe ProfessorEntidade</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Professor</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>9</td>
    <td>17</td>
  </tr>
  <tr>
    <td>2</td>
    <td>9</td>
    <td>25</td>
  </tr>
  <tr>
    <td>3</td>
    <td>9</td>
    <td>29</td>
  </tr>
  <tr>
    <td>4</td>
    <td>32</td>
    <td>17</td>
  </tr>
  <tr>
    <td>5</td>
    <td>32</td>
    <td>25</td>
  </tr>
  <tr>
    <td>6</td>
    <td>32</td>
    <td>29</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável Entidade</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>10</td>
    <td>18</td>
  </tr>
  <tr>
    <td>2</td>
    <td>10</td>
    <td>25</td>
  </tr>
  <tr>
    <td>3</td>
    <td>10</td>
    <td>35</td>
  </tr>
  <tr>
    <td>4</td>
    <td>38</td>
    <td>18</td>
  </tr>
  <tr>
    <td>5</td>
    <td>38</td>
    <td>25</td>
  </tr>
  <tr>
    <td>6</td>
    <td>38</td>
    <td>35</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Obj</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>14</td>
    <td>15</td>
  </tr>
  <tr>
    <td>2</td>
    <td>14</td>
    <td>16</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Other</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>16</td>
    <td>17</td>
  </tr>
  <tr>
    <td>2</td>
    <td>16</td>
    <td>18</td>
  </tr>
</table>
<br>
<strong>Teste de Grafo de Fluxo de Controle</strong><br>
5. Método: equals(Object obj)
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Testes%20de%20Grafo%20de%20Fluxo%20de%20Controle/Classe%20Aluno%20Metodo%20Equals.png'>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20ProfessorEntidade.png'>
<H3>8. Classe Rg</H3>
<strong>Testes de Fluxo de Dados</strong><br>
<table>
  <tr>
    <th colspan="3">1. Variável Numero</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>10</td>
    <td>18</td>
  </tr>
  <tr>
    <td>2</td>
    <td>10</td>
    <td>25</td>
  </tr>
  <tr>
    <td>3</td>
    <td>10</td>
    <td>29</td>
  </tr>
  <tr>
    <td>4</td>
    <td>32</td>
    <td>18</td>
  </tr>
  <tr>
    <td>5</td>
    <td>32</td>
    <td>25</td>
  </tr>
  <tr>
    <td>6</td>
    <td>32</td>
    <td>29</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">2. Variável orgaoExpedidor</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>11</td>
    <td>19</td>
  </tr>
  <tr>
    <td>2</td>
    <td>11</td>
    <td>25</td>
  </tr>
  <tr>
    <td>3</td>
    <td>11</td>
    <td>35</td>
  </tr>
  <tr>
    <td>4</td>
    <td>38</td>
    <td>19</td>
  </tr>
  <tr>
    <td>5</td>
    <td>38</td>
    <td>25</td>
  </tr>
  <tr>
    <td>6</td>
    <td>38</td>
    <td>35</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">3. Variável Obj</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>15</td>
    <td>17</td>
  </tr>
</table>
<br>
<table>
  <tr>
    <th colspan="3">4. Variável Other</th>
  </tr>
  <tr>
    <th>par d-u</th>
    <th>d</th>
    <th>u</th>
  </tr>
  <tr>
    <td>1</td>
    <td>17</td>
    <td>18</td>
  </tr>
  <tr>
    <td>2</td>
    <td>17</td>
    <td>19</td>
  </tr>
</table>
<br>
<strong>Teste de Grafo de Fluxo de Controle</strong><br>
5. Método: equals(Object obj)
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Testes%20de%20Grafo%20de%20Fluxo%20de%20Controle/Classe%20Aluno%20Metodo%20Equals.png'>
<strong>Cobertura de Código</strong>
<img src='https://github.com/CallmeHenrique/Sistema-de-JudocasProj/blob/Henrique/documentos/Cobertura%20de%20Codigo/Classe%20RG.png'>
