<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20231215123150 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE pokemon ADD CONSTRAINT FK_62DC90F3C54C8C93 FOREIGN KEY (type_id) REFERENCES tipo_pokemon (id)');
        $this->addSql('CREATE INDEX IDX_62DC90F3C54C8C93 ON pokemon (type_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE pokemon DROP FOREIGN KEY FK_62DC90F3C54C8C93');
        $this->addSql('DROP INDEX IDX_62DC90F3C54C8C93 ON pokemon');
    }
}
