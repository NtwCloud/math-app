# Guia de Fluxo de Trabalho para Desenvolvedores

Este documento explica, passo a passo, o fluxo de trabalho para desenvolver no monorepositório do **Schedule App**. Seguindo estas etapas, você vai evitar erros, reduzir conflitos de merge e garantir uma colaboração tranquila via Pull Requests (PRs).

---

## 1. **Preparação**

### a. Clone o repositório

```sh
git clone https://github.com/NtwCloud/schedule-app.git
cd schedule-app
```

### b. Certifique-se de que suas dependências estão atualizadas

```sh
- **Frontend:**
    ```sh
    cd frontend && npm install
    ```
- **Backend:**  
  Veja as instruções em `/backend/README.md`.

### c. Antes de criar uma Pull Request (PR) rode:

```sh
git checkout main
git pull origin main
```

Rode o comando acima antes de criar uma feature branch para garantir que você está trabalhando com a versão mais recente do código.

---

## 2. **Criação de Branch**

### a. Sempre crie uma nova branch para o seu trabalho (Milestone)

- Use nomes descritivos para as branches:
    - `feat/nome-da-feature`
    - `fix/descricao-do-bug`
    - `hotfix/correção-urgente`
    - `chore/atualização-de-dependencias`
    - `test/adição-de-testes`
    - `docs/atualização-da-documentação`
    - `style/atualização-de-estilos`

```sh
git checkout -b feat/nome-descritivo-da-feature
```

---

## 3. **Fazendo Alterações**

### a. Trabalhe apenas na sua feature branch! não faça alterações ou commits diretos na main!!!

- Evite commits diretamente nas branches `main` ou `develop`.

### b. Adicione/commite arquivos de forma incremental (issues)

- Escreva mensagens de commit claras e significativas.

- Rode o biome check e testes antes de fazer commites (ajuda a manter a qualidade do código):
    ```sh
    npx biome check
    npm test
    ```

### c. Hooks de pré-commit

- Se seu commit falhar nos checks e testes, corrija os problemas antes de tentar novamente.
- As mensagens de commit são verificadas automaticamente.

---

## 4. **Sincronize com o Remoto**

### a. Puxe as alterações mais recentes da branch base "main" regularmente

Sincronize com frequência para evitar conflitos:

```sh
git fetch origin
git rebase origin/main     # Se sua branch base for main
```

### b. Resolva qualquer conflito de merge localmente antes de fazer push.

---

## 5. **Envie Sua Branch com as alterações para o repositório remoto**

```sh
git push origin feature/nome-da-feature
```

---

## 6. **Abra um Pull Request (PR)**

- Acesse o GitHub e abra um PR da sua branch para `main` ou `develop`.
- Preencha o template do PR, descrevendo suas alterações.
- Vincule sempre as issues relacionadas, se houver.
- Assinale revisores (veja o CODEOWNERS ou pergunte ao time).

---

## 7. **Processo de Revisão de Código**

- Os revisores vão deixar comentários ou solicitar mudanças no código.
- Resolva todos os feedbacks e envie atualizações para sua branch.
- Todos os checks do CI (testes, lint, build) devem passar, para garantir a qualidade do código.
- Pelo menos uma aprovação é obrigatória antes de fazer o merge.

---

## 8. **Merge & Limpeza**

- Apenas mantenedores devem fazer o merge dos PRs.
- Após o merge, exclua sua branch de feature:
    ```sh
    git branch -d feature/nome-da-feature # Apaga a feature-branch localmente
    git push origin --delete feature/nome-da-feature # Apaga a feature-branch remotamente no Github
    ```

---

## 9. **Boas Práticas**

- Mantenha os PRs pequenos e focados.
- Não faça commits grandes ou com **várias mudanças não relacionadas juntas**.
- Mantenha a documentação (README, docs de API) atualizada.
- Respeite as branches protegidas (`main`, `develop`).
- Pergunte! A colaboração também é aprendizado.

---

## 10. **Erros Comuns & Como Evitar**

- **Conflitos de merge:**  
  Puxe e faça rebase frequentemente; resolva conflitos localmente.
- **Checks falhando:**  
  Rode o biomejs, testes e use hooks de pré-commit antes de enviar.
- **Commits pouco claros:**  
  Siga o padrão de mensagens de commit.
- **Commits diretos em main/develop:**  
  Sempre trabalhe em uma branch e use PRs para entregas no repositório!

---

## 11. **Precisa de Ajuda?**

- Pergunte no chat do time ou abra uma Discussion no GitHub.
- Consulte a documentação do projeto em `/docs`.

---

**Seguindo este fluxo de trabalho, você vai manter o repositório saudável, evitar erros e tornar o trabalho em equipe mais divertido!**
