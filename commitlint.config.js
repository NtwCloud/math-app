module.exports = {
  extends: ['@commitlint/config-conventional'],
  rules: {
    'type-enum': [
      2,
      'always',
      ['adds', 'feat', 'fix', 'hotfix', 'chore', 'docs', 'test']
    ]
  }
};