from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# Dicionário simulando um banco de dados de usuários
users = {
    'john': {'password': 'doe123', 'age': 25},
    'jane': {'password': 'smith456', 'age': 30}
}

@app.route('/')
def login():
    return render_template('login.html')

@app.route('/authenticate', methods=['POST'])
def authenticate():
    username = request.form['username']
    password = request.form['password']
    age = int(request.form['age'])
    
    if username in users:
        if users[username]['password'] == password:
            if age >= 18:
                return f'Bem-vindo, {username}! Você tem mais de 18 anos e está autorizado.'
            else:
                return 'Desculpe, você não tem idade suficiente para acessar este recurso.'
        else:
            return 'Senha incorreta. Tente novamente.'
    else:
        return 'Nome de usuário não encontrado.'

if __name__ == '__main__':
    app.run(debug=True)
