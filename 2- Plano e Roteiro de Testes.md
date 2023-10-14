# Plano de Teste

**Course Flow**

## 1 - Introdução
No cenário educacional moderno, a gestão eficiente de cursos é fundamental para instituições de ensino e plataformas de aprendizado online. Para atender a essa necessidade crescente, foi desenvolvido um avançado programa de cadastro de cursos, uma ferramenta poderosa que simplifica o processo de criação, organização e administração de cursos educacionais. Esse programa não apenas oferece às instituições de ensino um método simplificado para apresentar seus cursos, mas também proporciona uma experiência transparente e interativa para os alunos em busca de conhecimento.

## 2 - Requisitos a Testar

1. Requisitos Funcionais:

   1.1 Adicionar Curso:
   - O sistema deve permitir que administradores adicionem novos cursos com informações completas, incluindo título, descrição, carga horária e datas relevantes.
   - Após a adição, o curso deve ser visível na lista de cursos disponíveis para inscrição.

   1.2 Excluir Curso:
   - O sistema deve permitir que administradores excluam cursos existentes.
   - Após a exclusão, o curso deve ser removido do banco de dados e não deve mais aparecer na lista de cursos disponíveis.

2. Requisitos Não Funcionais:
   2.1 Segurança:
   - O sistema deve garantir a segurança dos dados do curso e dos usuários, exigindo autenticação para acessar informações sensíveis.
   - Deve resistir a testes de penetração, protegendo-se contra acessos não autorizados e possíveis vulnerabilidades.

   2.2 Banco de Dados:
   - O sistema deve manter um desempenho estável mesmo sob carga significativa de dados.
   - Deve realizar operações de adição e exclusão de cursos de forma eficiente, mesmo durante picos de atividade.
     
### Casos de uso:

Identificador do caso de uso | Nome do caso de uso
-----------------------------|---------------------
id adCurso                   |      adicionar curso
id exCurso                   |      excluir curso

### Requisitos não-funcionais:

Identificador do requisito   | Nome do requisito
-----------------------------|---------------------
id  seguranca                |     Segurança
id  bancoDados               |     Banco de Dados 


## 3 - Tipos de teste
- Teste de interface de usuário(UI);
- Teste de adição de curso, turmas e professores;
- Teste de edição de curso, turmas e professores;
- Teste de exclusão de curso, turmas e professores;
- Teste de integração com o banco de dados;
- Entre outros.

### 3.1 - Métodos da Classe 
Para teste de funcionalidade.
Aqui deve-se verificar se cada classe retorna o esperado.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            descreva aqui o objetivo
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade (x)
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca (x)
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Programador(es) ou equipe de testes
        </th>
    </tr>
</table>
<br/>

### 3.2 - Persistência de Dados
Para teste de integridade de dados e do banco de dados.
Aqui deve-se verificar se os dados não se perdem ao desligar o programa. Se o programa consegue se recuperar em caso de falha ou fechamento repentino.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se dados são mantidos após súbito desligamento do programa .
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema (x)
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Programador(es) ou equipe de testes
        </th>
    </tr>
</table>
<br/>

### 3.3 - Integração dos Componentes
Para teste de funcionalidade.
Aqui deve-se verificar se as classes e métodos conseguem fazer a integração entre elas para uma sequência de ações do programa.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            descreva aqui o objetivo
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração (x)
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca (x)
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Programador(es) ou equipe de testes
        </th>
    </tr>
</table>
<br/>

## 4 - Recursos

### 4.1 - Ambiente de teste - Software e Hardware
Software: Eclipse </br>
Hardware (requisitos mínimos): 2 GB RAM e um processador core i3

### 4.2 - Ferramenta de teste
O Eclipse é um ambiente de desenvolvimento integrado (IDE) de código aberto amplamente utilizado por desenvolvedores de software. Está disponível para Windows, macOS e Linux, proporcionando consistência de desenvolvimento em diferentes sistemas operacionais.

## 5 - Cronograma

Tipo de teste      | Duração | data de início | data de término
-------------------|---------|----------------|-----------------
planejar teste     |         | dd/mm/aaaa     | dd/mm/aaaa
projetar teste     |         | dd/mm/aaaa     | dd/mm/aaaa
implementar teste  |         | dd/mm/aaaa     | dd/mm/aaaa
executar teste     |         | dd/mm/aaaa     | dd/mm/aaaa
avaliar teste      |         | dd/mm/aaaa     | dd/mm/aaaa
</br>

# Roteiro de Teste

<b>1- Funcionalidade: Adicionar curso</b>

Cenário: Realizar o cadastro do curso no sistema <br>
Dado que acessa o sistema Course Flow <br>
Quando seleciona a opção curso adicionar <br>
E realiza o preenchimento das informações <br>
E pressiona Enter <br>
Então exibe uma lista de cursos adicionados <br>

<b>2- Funcionalidade: Excluir curso</b>

Cenário: Realizar a exclusão de curso no sistema <br>
Dado que acessa o sistema Course Flow <br>
Quando seleciona a opção curso excluir <br>
E realiza a confirmação da exclusão <br>
E pressiona Enter <br>
Extão o curso é excluido do banco de dados <br>

<b>3- Funcionalidade: Cadastro de professores</b>

Cenário: Realizar o cadsatro do professor no sistema <br>
Dado que acessa o sistema Course Flow <br>
Quando seleciona opção professor adicionar <br>
E realiza o preenchimento das informações <br>
E pressiona Enter <br>
Então o professor é adicionado ao banco de dados <br>
