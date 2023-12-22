<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20231214192502 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE line ADD order_line_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE line ADD CONSTRAINT FK_D114B4F6BB01DC09 FOREIGN KEY (order_line_id) REFERENCES `order` (id)');
        $this->addSql('CREATE INDEX IDX_D114B4F6BB01DC09 ON line (order_line_id)');
        $this->addSql('ALTER TABLE product ADD line_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE product ADD CONSTRAINT FK_D34A04AD4D7B7542 FOREIGN KEY (line_id) REFERENCES line (id)');
        $this->addSql('CREATE UNIQUE INDEX UNIQ_D34A04AD4D7B7542 ON product (line_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE product DROP FOREIGN KEY FK_D34A04AD4D7B7542');
        $this->addSql('DROP INDEX UNIQ_D34A04AD4D7B7542 ON product');
        $this->addSql('ALTER TABLE product DROP line_id');
        $this->addSql('ALTER TABLE line DROP FOREIGN KEY FK_D114B4F6BB01DC09');
        $this->addSql('DROP INDEX IDX_D114B4F6BB01DC09 ON line');
        $this->addSql('ALTER TABLE line DROP order_line_id');
    }
}
