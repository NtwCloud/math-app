# Schedule Appointment App!

Esse é um app focado em agendamentos de atendimentos profissionais de diversas especialidades, com o objetivo de facilitar a vida dos pacientes e profissionai.

---

## 🚀 Stack Tecnológica

**Frontend**

- [Vite](https://vitejs.dev/)
- [React](https://react.dev/) + [React Router v6](https://reactrouter.com/)
- [Tailwind CSS](https://tailwindcss.com/)
- [shadcn/ui](https://ui.shadcn.com/)
- [Zustand](https://zustand-demo.pmnd.rs/)
- [Zod](https://zod.dev/)
- [nuqs](https://github.com/47ng/nuqs)
- [React Hook Form](https://react-hook-form.com/)
- [Axios](https://axios-http.com/)
- [BiomeJS](https://biomejs.dev/) (linter/formatador)
- [Husky](https://typicode.github.io/husky/#/)
- [Jest](https://jestjs.io/)
- [React Testing Library](https://testing-library.com/docs/react-testing-library/intro/)

**Backend**

- [Java](https://www.java.com/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [JWT](https://jwt.io/)
- OAuth2
- Docker

**Banco de Dados**

- [PostgreSQL](https://www.postgresql.org/)

**Infraestrutura**

- AWS ECS (Backend)
- AWS Amplify (Frontend)

**CI/CD**

- [GitHub Actions](https://github.com/features/actions) (Workflows para monorepo)

---

## 🗂️ Estrutura do Monorepo

```
schedule-app/
├── .github/workflows/   # Workflows de CI/CD
├── backend/             # Backend Spring Boot
├── frontend/            # Frontend Vite + React
├── infra/               # Infraestrutura como código (Terraform, CloudFormation)
├── docs/                # Documentação
├── .husky/              # Hooks do Husky (pre-commit linting)
├── .biome/              # Configuração do BiomeJS
└── README.md

```

---

## 👥 Como Começar a Colaborar

1. **Clone o Repositório**

    ```sh
    git clone https://github.com/NtwCloud/schedule-app.git
    cd schedule-app
    ```

2. **Configure Seu Ambiente**

    - Instale Git, Node.js (para o frontend), Java e Docker(para o backend).
    - Instale as dependências do projeto:
        - Frontend: `cd frontend && npm install`
        - Backend: Veja `/backend/README.md` (ou rode com Maven/IDE).

3. **Hooks de Pré-commit & Linting**

    - Husky e BiomeJS rodam automaticamente antes de cada commit para assegurar a qualidade do código.
    - Mensagens de commit são verificadas pelo git-commit-msg-linter.
    - Se aparecerem erros, rode:
        ```sh
        npx biome check
        ```

4. **Branching & PRs**

    - Crie uma nova branch para o seu trabalho:  
      `git checkout -b feature/nome-da-sua-feature`
    - Faça push e abra um Pull Request (PR) para revisão.
    - Todas as mudanças passam por PRs e revisão de código.

5. **Revisão de Código**

    - Pelo menos um colega deve revisar e aprovar seu PR.
    - Corrija qualquer problema apontado pelo CI/CD.

6. **CI/CD**
    - Workflows rodam automaticamente a cada push/PR.
    - Só faça merge após todos os checks passarem.

---

## 💡 Diretrizes de Contribuição

- Siga o padrão de código e convenções de nomes para as branches de trabalho e commites.
- Escreva mensagens de commit claras.
- Mantenha a documentação atualizada.
- Respeite branches protegidas (`main`, `develop`).
- Pergunte sempre, colaborar é aprender!

---

## 📚 Documentação

- Veja `/docs` para arquitetura, API e guias de contribuição.
- Adicione ADRs para decisões importantes.

---

## 🙌 Licença & Créditos

Open-source, para fins educacionais.  
Feito por estudantes, para estudantes!
