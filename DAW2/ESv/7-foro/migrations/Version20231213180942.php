<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20231213180942 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE tema ADD foro_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE tema ADD CONSTRAINT FK_61E3A538F5FF53F6 FOREIGN KEY (foro_id) REFERENCES foro (id)');
        $this->addSql('CREATE INDEX IDX_61E3A538F5FF53F6 ON tema (foro_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE tema DROP FOREIGN KEY FK_61E3A538F5FF53F6');
        $this->addSql('DROP INDEX IDX_61E3A538F5FF53F6 ON tema');
        $this->addSql('ALTER TABLE tema DROP foro_id');
    }
}
