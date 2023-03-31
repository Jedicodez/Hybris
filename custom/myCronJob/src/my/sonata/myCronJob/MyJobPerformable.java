package my.sonata.myCronJob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import my.sonata.myCronJob.model.HelloWorldCronJobModel;
import org.apache.log4j.Logger;

public class MyJobPerformable extends AbstractJobPerformable<HelloWorldCronJobModel>
{
    private static final Logger LOG = Logger.getLogger(MyJobPerformable.class.getName());

    @Override
    public PerformResult perform(final HelloWorldCronJobModel cronJobModel)
    {
        try{
            LOG.info("**********************************");
            LOG.info("Greeting from MyJobPerformable!!!");
            LOG.info("**********************************");

            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        catch (final Exception e){
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
        }
    }
}
