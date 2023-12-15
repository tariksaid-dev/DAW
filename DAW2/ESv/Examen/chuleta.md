php bin/console doctrine:database:create
1º php bin/console make:migration
2º php bin/console doctrine:migrations:migrate
php bin/console make:entity
php bin/console make:crud
php bin/console make:controller
symfony server:start

php bin/console make:user
php bin/console make:auth
php bin/console make:registration-form

php bin/console doctrine:schema:update --force
